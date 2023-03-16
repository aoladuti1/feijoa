import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/***
 * The Feijoa symbol table class
 */
public class FJSymbols {

    private ArrayList<HashMap<String, FJTO>> tree = new ArrayList<>();

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

    private HashMap<String, FJTO> currentTable() {
        return getTable(level);
    }

    private HashMap<String, FJTO> getTable(int level) {
        return tree.get(level);
    }

    public FJSymbols(FJCallStack callStack) {
        this.callStack = callStack;
        tree.add(new HashMap<>());
    }

    public HashMap<String, FJTO> newScope() {
        level += 1;
        tree.add(new HashMap<>());
        return currentTable();
    }

    public HashMap<String, FJTO> oldScope() {
        tree.remove(tree.size() - 1);
        level -= 1;
        return currentTable();
    }

    public void startStructDef(String typeName) {
        FJStructDef add = new FJStructDef(typeName);
        put(typeName, new FJTO(add, FJTypes.STRUCT_DEF));
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
    public HashMap<String, FJTO> findTable(String FirstID) {
        boolean found = false;
        int curLevel = level;
        HashMap<String, FJTO> lastTable = tree.get(tree.size() - 1);
        HashMap<String, FJTO> symbols = lastTable;
        for (; found != true && curLevel != -1; curLevel -= 1) {
            symbols = getTable(curLevel);
            found = symbols.containsKey(FirstID);
        }
        return found ? symbols : null;
    }
    
    @SuppressWarnings("unchecked")
    private void fullPut(
        String[] splits, FJTO o, HashMap<String, FJTO> table) {
            FJTO holder;
            if (splits.length == 1) {
                holder = new FJTO(table, FJTypes.STRUCT);
            } else {
                holder = resolve(splits, table);
                if (holder == null) return;
            }
            if (holder.type == FJTypes.STRUCT) {
                ((HashMap<String, FJTO>) holder.obj).put(splits[splits.length - 1], o);
            } else if (holder.type == FJTypes.STRUCT_DEF) {
                ((FJStructDef) holder.obj).addMember(splits[splits.length - 1], o);
            }
        
    }

    @SuppressWarnings("unchecked")
    public FJTO fullGet(
        String[] splits, HashMap<String, FJTO> table) {
            FJTO holder;
            if (splits.length == 1) {
                holder = new FJTO(table, FJTypes.STRUCT);
            } else {
                holder = resolve(splits, table);
                if (holder == null) return null;
            }
            if (holder.type == FJTypes.STRUCT) {
                return ((HashMap<String, FJTO>) holder.obj).get(splits[splits.length - 1]);
            } else if (holder.type == FJTypes.STRUCT_DEF) {
                return ((FJStructDef) holder.obj).getMember(splits[splits.length - 1]);
            }
            return null;
    }

    @SuppressWarnings("unchecked")
    private FJTO resolve(String[] splits, HashMap<String, FJTO> table) {
        HashMap<String, FJTO> subTable = table;
        FJTO fetch = null;
        int i;
        for (i = 0; i < splits.length - 1; i++) {
            fetch = subTable.get(splits[i]);
            if (fetch == null) {
                System.err.println("Cannot find symbol " + splits[i]);
                return null;
            }
            if (fetch.type == FJTypes.STRUCT) {
                subTable = (HashMap<String, FJTO>) fetch.obj;
            } else if (fetch.type == FJTypes.STRUCT_DEF) {
                subTable = ((FJStructDef) fetch.obj).members;
            }
        }
        return fetch;

    }

    public FJTO get(String ID) {
        String[] splits = ID.split(selectOp);
        splits = SDstack.qualify(splits);
        HashMap<String, FJTO> table = findTable(splits[0]);
        if (callStack.containsID(splits[0])) {
            table = callStack.findCurTable(splits[0]);
        }
        if (table == null) {
            System.err.println("Cannot find the symbol " + ID);
            return null;
        }
        return fullGet(splits, table);
    }

    public void put(String ID, FJTO o) {
        String[] splits = ID.split(selectOp);
        splits = SDstack.qualify(splits);
        HashMap<String, FJTO> table = findTable(splits[0]);
        if (callStack.containsID(splits[0])) {
            table = callStack.findTopTable(splits[0]);
        }
        if (table == null) { table = currentTable(); }
        fullPut(splits, o, table);
    }

    public boolean containsGlobal(String ID) {
        return getTable(0).containsKey(ID);
    }

    public HashMap<String, FJTO> globalTable() {
        return getTable(0);
    }

    // search and destroy. will look on all levels for the variable
    @SuppressWarnings("unchecked")
    public Object remove(String ID) {
        String[] splits = ID.split(selectOp);
        HashMap<String, FJTO> table = findTable(ID);
        if (splits.length == 1) {
            return table.remove(ID);
        } else if (table != null) {
            HashMap<String, FJTO> subTable 
                = ((HashMap<String, FJTO>) resolve(splits, table).obj);
            return subTable.remove(splits[splits.length - 1]);
        }
        return null;
    }

}