import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

class STable {

    private ArrayList<HashMap<String, Object>> tree = new ArrayList<>();

    final static String selectOp = "\\.";
    ArrayList<String> IDStack = new ArrayList<>();
    ArrayList<String> nameStack = new ArrayList<>();
    FJCallStack callStack = new FJCallStack();
    FJSDStack SDstack = new FJSDStack();
    
    
    private int level = 0;
    private static AtomicInteger anonCount = new AtomicInteger(-1);

    static String newAnonID() {
        return "$" + anonCount.incrementAndGet();
    }

    public FJSDStack SDStack() {
        return SDstack;
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
        tree.remove(tree.size() - 1);
        level -= 1;
        return currentTable();
    }

    public void startStructDef(String typeName) {
        FJStructDef add = new FJStructDef(typeName);
        put(typeName, add);
        SDstack.declare(add);
    }

    public void endStructDef() {
        SDstack.finish();
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
    public HashMap<String, Object> findTable(String FirstID) {
        boolean found = false;
        int curLevel = level;
        HashMap<String, Object> lastTable = tree.get(tree.size() - 1);
        HashMap<String, Object> symbols = lastTable;
        for (; found != true && curLevel != -1; curLevel -= 1) {
            symbols = getTable(curLevel);
            found = symbols.containsKey(FirstID);
        }
        return found ? symbols : null;
    }

    @SuppressWarnings("unchecked")
    private void fullPut(
        String[] splits, Object o, HashMap<String, Object> table) {
            Object holder;
            if (splits.length == 1) {
                holder = table;
            } else {
                holder = resolve(splits, table);
            }
            try {
                ((HashMap<String, Object>) holder).put(splits[splits.length - 1], o);
            } catch (Exception isAStructDef) {
                ((FJStructDef) holder).addMember(splits[splits.length - 1], o);
            }
        
    }

    @SuppressWarnings("unchecked")
    public Object fullGet(
        String[] splits, HashMap<String, Object> table) {
            Object holder;
            if (splits.length == 1) {
                holder = table;
                
            } else {
                holder = resolve(splits, table);
            }
            try {
                return ((HashMap<String, Object>) holder).get(splits[splits.length - 1]);
            } catch (Exception isAStructDef) {
                return ((FJStructDef) holder).getMember(splits[splits.length - 1]);
            }
            
        
    }

    @SuppressWarnings("unchecked")
    private Object resolve(String[] splits, HashMap<String, Object> table) {
        HashMap<String, Object> subTable = table;
        FJStructDef sdef = null;
        boolean lastDef = false;
        int i;
        for (i = 0; i < splits.length - 1; i++) {
            try {
                subTable = (HashMap<String, Object>) subTable.get(splits[i]);
                lastDef = false;
            } catch (Exception FJ_Excpetion) {
                sdef = ((FJStructDef) subTable.get(splits[i]));
                subTable = sdef.members;
                lastDef = true;
            }
        }
        if (lastDef) {
            return sdef;
        } else {
            return subTable;
        }

    }

    @SuppressWarnings("unchecked")
    public Object get(String ID) {
        String[] splits = ID.split(selectOp);
        splits = SDstack.qualify(splits);
        HashMap<String, Object> table = findTable(splits[0]);
        if (table == null) {
            table = callStack.findCurTable(splits[0]);
        }
        if (table == null) {
            System.err.println("Cannot find the symbol " + ID);
            return null;
        }
        return fullGet(splits, table);
    }

    public void put(String ID, Object o) {
        String[] splits = ID.split(selectOp);
        splits = SDstack.qualify(splits);
        HashMap<String, Object> table = findTable(splits[0]);
        if (table == null) {
            table = callStack.findTopTable(splits[0]);
        }
        if (table == null) { table = currentTable(); }
        fullPut(splits, o, table);
    }

    public boolean containsGlobal(String ID) {
        return getTable(0).containsKey(ID);
    }

    public HashMap<String, Object> globalTable() {
        return getTable(0);
    }

    // search and destroy. will look on all levels for the variable
    @SuppressWarnings("unchecked")
    public Object remove(String ID) {
        String[] splits = ID.split(selectOp);
        HashMap<String, Object> table = findTable(ID);
        if (splits.length == 1) {
            return table.remove(ID);
        } else if (table != null) {
            HashMap<String, Object> subTable 
                = (HashMap<String, Object>) resolve(splits, table);
            return subTable.remove(splits[splits.length - 1]);
        }
        return null;
    }

}