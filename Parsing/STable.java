import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

class STable {

    private LinkedList<HashMap<String, Object>> tree = new LinkedList<>();

    final static String selectOp = "\\.";
    ArrayList<String> IDStack = new ArrayList<>();
    FJCallStack callStack = new FJCallStack();

    private int level = 0;
    private static AtomicInteger anonCount = new AtomicInteger(-1);

    static String newAnonID() {
        return "$" + anonCount.incrementAndGet();
    }

    private HashMap<String, Object> currentTable() {
        return getTable(level);
    }

    private HashMap<String, Object> getTable(int level) {
        return tree.get(level);
    }

    public STable(FJCallStack callStack) {
        this.callStack = callStack;
        tree.add(new HashMap<>());
    }

    public HashMap<String, Object> newScope() {
        level += 1;
        tree.add(new HashMap<>());
        return currentTable();
    }

    public HashMap<String, Object> oldScope() {
        tree.removeLast();
        level -= 1;
        return currentTable();
    }

    /**
     * Returns the symbol table of an ID (or the current scope's symbol table if it
     * cannot be found) and the index of the symbol table (or -1 if it cannot be found) in a [ table, index ]
     * array.
     * 
     * @param FirstID the first part of a variable ID
     *                before the member selection operator, if it exists
     * @return the symbol table of an ID and the index of the symbol table in a [
     *         table, index ] array
     */
    public Object[] tableAndLevel(String FirstID) {
        boolean found = false;
        int curLevel = level;
        HashMap<String, Object> lastTable = tree.getLast();
        HashMap<String, Object> symbols = lastTable;
        for (; found != true && curLevel != -1; curLevel -= 1) {
            symbols = getTable(curLevel);
            found = symbols.containsKey(FirstID);
        }
        if (found == true) {
            curLevel++;
        } else {
            symbols = lastTable;
        }
        return new Object[] { symbols, curLevel };
    }

    /***
     * Returns the fully selected object.
     * E.g. (if the selection operator is '.') a.b.c returns c, or if
     * {@code penultimate} is true,
     * returns b. (The last object with a member selection operator after it.)
     * Only works when the first object is a struct.
     * 
     * @param splits the ID split up by member selection operator
     * @param table  the resolved variable symbol table
     * @return
     */
    @SuppressWarnings("unchecked")
    private Object fullSelect(String[] splits, HashMap<String, Object> table, boolean penultimate) {
        HashMap<String, Object> subTable = table;
        ArrayList<Object> list = null;
        boolean lastList = false;
        int i;
        for (i = 0; i < splits.length - 1; i++) {
            try {
                subTable = (HashMap<String, Object>) subTable.get(splits[i]);
                lastList = false;
            } catch (Exception FJ_Excpetion) {
                list = (ArrayList<Object>) subTable.get(splits[i]);
                lastList = true;
            }
        }
        if (lastList) {
            return list; // TODO: Handle lists properly
        } else {
            return (penultimate) ? subTable : subTable.get(splits[i]);
        }
    }

    @SuppressWarnings("unchecked")
    public Object get(String ID) {
        String[] splits = ID.split(selectOp);
        Object[] tableAndLevel = tableAndLevel(splits[0]);
        HashMap<String, Object> table = (HashMap<String, Object>) tableAndLevel[0];
        if (callStack.containsID(ID)) {
            table = callStack.currentTable();
        } else if (((int) tableAndLevel[1]) < 0) {
            System.err.println("Cannot find the symbol " + ID);
            return null;
        }
        if (splits.length == 1) {
            return table.get(ID);
        } else {
            return fullSelect(splits, table, false);
        }
    }

    @SuppressWarnings("unchecked")
    public void put(String ID, Object value) {
        String[] splits = ID.split(selectOp);
        Object[] tableAndLevel = tableAndLevel(splits[0]);
        HashMap<String, Object> table = (HashMap<String, Object>) tableAndLevel[0];
        if (callStack.containsID(ID)) {
            table = callStack.topTable();
        }
        if (splits.length == 1) {
            table.put(ID, value);
        } else {
            HashMap<String, Object> subTable 
                = (HashMap<String, Object>) fullSelect(splits, table, true);
            subTable.put(splits[splits.length - 1], value);
        }

    }

    // search and destroy. will look on all levels for the variable
    @SuppressWarnings("unchecked")
    public Object remove(String ID) {
        String[] splits = ID.split(selectOp);
        Object[] tableAndLevel = tableAndLevel(splits[0]);
        HashMap<String, Object> table = (HashMap<String, Object>) tableAndLevel[0];
        if (splits.length == 1) {
            return table.remove(ID);
        } else {
            HashMap<String, Object> subTable 
                = (HashMap<String, Object>) fullSelect(splits, table, true);
            return subTable.remove(splits[splits.length - 1]);
        }
    }

}