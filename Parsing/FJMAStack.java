import java.util.ArrayList;

public class FJMAStack {

    ArrayList<MAEntry> stack = new ArrayList<>();
    
    class MAEntry{

        FJTO o;
        FJTO index;
        String name;

        public MAEntry(FJTO o, String name) {
            this.o = o;
            this.name = name;
        }

        public MAEntry(FJTO o, FJTO index, String name) {
            this.o = o;
            this.index = index;
            this.name = name;
        }

        boolean isList() {
            return this.o.isList();
        }
        
    }

    STable symbols;

    public FJMAStack(STable symbols) {
        this.symbols = symbols;
    }

    void push(FJTO o, String name) {
        stack.add(new MAEntry(o, name));
    }

    void push(FJTO o, FJTO index, String name) {
        stack.add(new MAEntry(o, index, name));
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
            MAEntry entry = stack.get(i);
            if (entry.isList()) {
                FJ.listEquals(entry.o, entry.index, fjlist.get(i));
            } else {
                symbols.put(entry.name, fjlist.get(i));
            }
        }
    }


}