import java.util.ArrayList;

/***
 * Stack for pythonic list unpacking (e.g. a, b = ["a", "b"])
 */
public class FJLUStack {

    ArrayList<LUEntry> stack = new ArrayList<>();
    
    class LUEntry{

        FJTO o;
        FJTO index;
        String name;

        public LUEntry(FJTO o, String name) {
            this.o = o;
            this.name = name;
        }

        public LUEntry(FJTO o, FJTO index, String name) {
            this.o = o;
            this.index = index;
            this.name = name;
        }

        boolean isList() {
            return this.o.isList();
        }
        
    }

    STable symbols;

    public FJLUStack(STable symbols) {
        this.symbols = symbols;
    }

    void push(FJTO o, String name) {
        stack.add(new LUEntry(o, name));
    }

    void push(FJTO o, FJTO index, String name) {
        stack.add(new LUEntry(o, index, name));
    }

    void popAssign(FJTO list) {
        if (!list.isList()) {
            System.err.println("List assignment attempted without a list for " + stack.get(0).name);
            return; // error
        }
        FJList fjlist = ((FJList) list.obj);
        if (((FJList) list.obj).size() < stack.size()) {
            System.err.println("Too many variables for multi-assignment, starting with " + stack.get(0).name);
            return; // error
        }
        for (int i = 0; i < stack.size(); i++) {
            LUEntry entry = stack.get(i);
            if (entry.isList()) {
                FJ.listEquals(entry.o, entry.index, fjlist.get(i));
            } else {
                symbols.put(entry.name, fjlist.get(i));
            }
        }
    }


}