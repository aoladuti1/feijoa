import java.util.ArrayList;

/***
 * Stack for pythonic list unpacking (e.g. a, b = ["a", "b"])
 */
public class FJLUStack {

    ArrayList<LUEntry> stack = new ArrayList<>();
    
    class LUEntry{

        FJTO o;
        FJTO index;
        String ID;

        public LUEntry(String ID, FJTO o) {
            this.ID = ID;
            this.o = o;
        }

        public LUEntry(String ID, FJTO index, FJTO o) {
            this.ID = ID;
            this.o = o;
            this.index = index;
 
        }

        boolean isList() {
            return this.o.isList();
        }
        
    }

    FJSymbols symbols;

    public FJLUStack(FJSymbols symbols) {
        this.symbols = symbols;
    }

    // push a normal variable to receive list elements
    void push(String ID, FJTO o) {
        stack.add(new LUEntry(ID, o));
    }

    // push the list ID to assign o to
    // index ID[index]
    void push(String ID, FJTO index, FJTO o) {
        stack.add(new LUEntry(ID, index, o));
    }

    /***
     * Unpacks the list.
     * @param list
     */
    void popAssign(FJTO list) {
        if (!list.isList()) {
            System.err.println("List assignment attempted without a list for " + stack.get(0).ID);
            return; // error
        }
        FJList fjlist = ((FJList) list.obj);
        if (((FJList) list.obj).size() < stack.size()) {
            System.err.println("Too many variables for multi-assignment, starting with " + stack.get(0).ID);
            return; // error
        }
        for (int i = 0; i < stack.size(); i++) {
            LUEntry entry = stack.get(i);
            if (entry.isList()) {
                FJ.listEquals(entry.o, entry.index, fjlist.get(i));
            } else {
                symbols.put(entry.ID, fjlist.get(i));
            }
        }
    }


}