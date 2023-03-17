import java.util.ArrayList;
import java.util.HashMap;

class SAEntry {

    FJStructDef structDef;
    HashMap<String, FJTO> struct = new HashMap<String, FJTO>();
    Object output;
    int argIndex = -1;
    int argCount = 0;
    int maxArgs;
    boolean[] visited;
    boolean selectingArgs; // if true, then args are being chosen like: height=5

    public SAEntry(FJStructDef structDef) {
        this.structDef = structDef;
        this.maxArgs = structDef.maxArgs();
        this.selectingArgs = false;
        this.visited = new boolean[maxArgs];
    }
}

/***
 * Stack for struct construction
 */
public class FJSCStack {
    ArrayList<SAEntry> stack = new ArrayList<>();
    FJSymbols symbols;

    public FJSCStack(FJSymbols symbols) {
        this.symbols = symbols;
    }

    public void push(String ID) {
        stack.add(new SAEntry((FJStructDef) this.symbols.get(ID).obj));
    }

    private SAEntry top() {
        return stack.get(stack.size() - 1);
    }
    
    public FJStructDef topDef() {
        return top().structDef;
    }

    public HashMap<String, FJTO> topStruct() {
        return top().struct;
    }

    public boolean tooManyArgs() {
        return top().argCount > top().maxArgs;
    }

    /***
     * Store o in the next uninitialised struct member variable
     * @param argc the argument count of the struct most recently still under construction
     * @param o the value to store
     */
    public void putVar(int argc, FJTO o) {
        String argName = topDef().getArgName(argc - 1);
        topStruct().put(argName, o);
    }

    /***
     * Initialise the struct member variable at index to its default
     * @param index the index of the member variable in the struct definition
     */
    public void putVar(int index) {
        String name = topDef().getArgName(index);
        topStruct().put(name, topDef().getDefault(name));
    }

    /** 
     * Assigns / initialises the member variable named ID to value o. 
     * @param ID member variable name
     * @param o the value to store in the function variable
     */ 
    public void putVar(String ID, FJTO o) {
        try {
            top().visited[topDef().getArgIndex(ID)] = true;
        } catch (IndexOutOfBoundsException FJException) {
            System.err.println(ID + " is not a valid argument name.");
        }
        top().selectingArgs = true;
        topStruct().put(ID, o);
    }

    public Object getVar(String ID) {
        return topStruct().get(ID);
    }


    public boolean containsID(String ID) {
        SAEntry cur = top();
        if (cur == null) {
            return false;
        }
        else {
            return cur.struct.containsKey(ID);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // set the next argument variable to o
    public void processArg(FJTO o) {
        SAEntry top = top();
        if (top.selectingArgs) {
            System.err.println(
                "Selecting arguments to pass with '=' "
                + "must not be followed by sequential argument assignment (without '=').");
            return;
        }
        top.selectingArgs = false;
        top.argCount++;
        top.visited[++top.argIndex] = true;
        if (tooManyArgs()) {
            System.err.println("Too many args");
            return;
        } else if (top.maxArgs > 0){
            putVar(top.argCount, o);
        }
    }

    // set the member variable named ID to o
    public void processArg(String ID, FJTO o) {
        SAEntry top = top();
        top.visited[topDef().getArgIndex(ID)] = true;
        top.selectingArgs = true;
        if (tooManyArgs()) {
            System.err.println("Too many args");
            return;
        } else if (top.maxArgs > 0){
            putVar(ID, o);
        }
    }

    // set all unset arguments to their defaults (if defaults exist)
    public void fillArgs() {
        SAEntry top = top();
        if (!top.selectingArgs) {
            for (int i = top.argIndex + 1; i < top.maxArgs; i++) {
                putVar(i);
            }
        } else {
            for (int i = 0; i < top.maxArgs; i++) {
                if (!top.visited[i])
                    putVar(i);
            }

        }
    }

    public void processLastArg(FJTO o) {
        processArg(o);
        fillArgs();
    }

    public void processLastArg(String ID, FJTO o) {
        processArg(ID, o);
        fillArgs();
    }

    public SAEntry pop() {
        return stack.remove(stack.size() - 1);
    }

    public HashMap<String, FJTO> popStruct() {
        return stack.remove(stack.size() - 1).struct;
    }




 
}
