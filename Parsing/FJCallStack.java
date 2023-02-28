import java.util.ArrayList; 
import java.util.HashMap; 
 
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.ARTGLLRDTHandle; 
 
class CSEntry {

    FJFunction function; 
    FJTO output; 
    int argIndex = -1; 
    int maxArgs = 0; 
    boolean[] visited; 
    boolean selectingArgs; 
    ArrayList<HashMap<String, FJTO>> funcVars; 
 
    public CSEntry(FJFunction function, FJTO output) { 
        this.function = function; 
        this.output = output; 
        this.maxArgs = function.maxArgs(); 
        this.funcVars = new ArrayList<HashMap<String, FJTO>>(); 
        this.funcVars.add(new HashMap<>()); 
        this.selectingArgs = false; 
        this.visited = new boolean[maxArgs]; 
    }
}

public class FJCallStack { 
    ArrayList<CSEntry> stack = new ArrayList<>(); 
    int pos = -1; 
 
    public void push(FJFunction func) { 
        stack.add(new CSEntry(func, null)); 
    }
    
    public void setLastValue(FJTO o) { 
        current().output = o; 
    } 
 
    public CSEntry current() { 
        if (pos != -1) 
            return stack.get(pos); 
        else  
            return null; 
    } 
 
    public FJTO getLastValue() { 
        return current().output; 
    } 
 
    public ARTGLLRDTHandle topProcedure() { 
        return topFunction().getProcedure(); 
    } 
     
    public FJFunction topFunction() { 
        return top().function; 
    } 
 
    public boolean tooManyArgs() { 
        CSEntry top = top(); 
        int argc = 0; 
        if (top.selectingArgs) { 
            argc = top.argIndex; 
        } else { 
            while (argc < top.visited.length) { 
                argc++; 
            } 
        } 
        return argc > top.maxArgs; 
    } 
 
    public void putVar(int argc, FJTO o) { 
        FJNamedObj fvar = topFunction().getArg(argc); 
        topTable().put(fvar.name, o); 
    } 
 
    /** 
     * Declares function variables with their default value. 
     * @param argc current arg count 
     */ 
    public void putVar(int argc) { 
        FJNamedObj fvar = topFunction().getArg(argc); 
        topTable().put(fvar.name, fvar.ftjo); 
    } 
 
    public void putVar(String ID, FJTO o) { 
        try { 
            top().visited[topFunction().getArgIndex(ID)] = true; 
        } catch (IndexOutOfBoundsException FJException) { 
            System.err.println(ID + " is not a valid argument name."); 
        } 
        top().selectingArgs = true; 
        topTable().put(ID, o); 
    } 
 
    public Object getVar(String ID) { 
        return currentTable().get(ID); 
    } 
 
    public HashMap<String, FJTO> topTable() { 
        return top().funcVars.get(0); 
    } 
 
    public HashMap<String, FJTO> currentTable() { 
        return current().funcVars.get(0); 
    } 
 
    public boolean containsID(String ID) { 
        CSEntry cur = current(); 
        if (cur == null) { 
            return false; 
        } 
        for (HashMap<String, FJTO> h : cur.funcVars) { 
            if (h.containsKey(ID)) return true; 
        } 
        return false; 
    } 
 
    public HashMap<String, FJTO> findCurTable(String firstID) { 
        if (stack.isEmpty()) { 
            return null; 
        } 
        for (HashMap<String, FJTO> h : current().funcVars) { 
            if (h.containsKey(firstID)) return h; 
        } 
        return null; 
    } 
 
    public HashMap<String, FJTO> findTopTable(String firstID) { 
        if (stack.isEmpty()) { 
            return null; 
        } 
        for (HashMap<String, FJTO> h : top().funcVars) { 
            if (h.containsKey(firstID)) return h; 
        } 
        return null; 
    }

    public boolean isEmpty() { 
        return stack.isEmpty(); 
    } 
 
    public void nextCall() { 
        pos++; 
    } 
 
    public void processArg(FJTO o) { 
        CSEntry top = top(); 
        if (top().selectingArgs) { 
            System.err.println( 
                "Selecting arguments to pass with '=' " 
                + "must not be followed by sequential argument assignment (without '=')."); 
            return; 
        } 
        top.selectingArgs = false; 
        int argc = ++top.argIndex; 
        top.visited[argc] = true; 
        if (tooManyArgs()) { 
            System.err.println("Too many args"); 
            return; 
        } else if (top.maxArgs > 0){ 
            putVar(argc, o); 
        } 
    } 
 
    public void processArg(String ID, FJTO o) { 
        CSEntry top = top(); 
        top.visited[topFunction().getArgIndex(ID)] = true; 
        top.selectingArgs = true; 
        if (tooManyArgs()) { 
            System.err.println("Too many args"); 
            return; 
        } else if (top.maxArgs > 0){ 
            putVar(ID, o); 
        } 
    } 
 
    public void fillArgs() { 
        CSEntry top = top(); 
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
     
 
    public CSEntry top() { 
        return stack.get(stack.size() - 1); 
    } 
 
    public CSEntry pop() { 
        pos--; 
        return stack.remove(stack.size() - 1); 
    } 
 
 
 
 
  
} 
