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
    boolean selectingArgs;

    public SAEntry(FJStructDef structDef) {
        this.structDef = structDef;
        this.maxArgs = structDef.maxArgs();
        this.selectingArgs = false;
        this.visited = new boolean[maxArgs];
    }

}
public class FJSAStack {
    ArrayList<SAEntry> stack = new ArrayList<>();
    STable symbols;
    int pos = -1;

    public FJSAStack(STable symbols) {
        this.symbols = symbols;
    }

    public void push(String ID) {
        stack.add(new SAEntry((FJStructDef) this.symbols.get(ID).obj));
        pos++;
    }

    public SAEntry current() {
        if (pos != -1)
            return stack.get(pos);
        else 
            return null;
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

    public void putVar(int argc, FJTO o) {
        String argName = topDef().getArgName(argc - 1);
        topStruct().put(argName, o);
    }

    public void putVar(int index) {
        String name = topDef().getArgName(index);
        topStruct().put(name, topDef().getDefault(name));
    }

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
        return current().struct.get(ID);
    }


    public boolean containsID(String ID) {
        SAEntry cur = current();
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
    

    private SAEntry top() {
        return stack.get(stack.size() - 1);
    }


    public SAEntry pop() {
        pos--;
        return stack.remove(stack.size() - 1);
    }

    public HashMap<String, FJTO> popStruct() {
        pos--;
        return stack.remove(stack.size() - 1).struct;
    }




 
}
