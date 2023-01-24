import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.*;
import java.util.LinkedList;



public class FJFunction {

    public FJFunction(String name) {
        this.name = name;
    }

    ARTGLLRDTHandle procedure = null;
    String name;

    LinkedList<FJNamedObj> args = new LinkedList<>();

    public void addArg(String ID) {
        this.args.add(new FJNamedObj(ID, null));
    }

    public void addArg(String ID, Object def) {
        this.args.add(new FJNamedObj(ID, def));
    }

    public FJNamedObj getArg(int index) {
        return args.get(index);
    }

    /***
     * Returns the index of the argument name or -1 if it is not found
     * @param ID argument name to search for
     * @return index of the argument name or -1 if it is not found
     */
    public int getArgIndex(String ID) {
        for (int i = 0; i < maxArgs(); i++) {
            if (ID.equals(args.get(i).name)) {

                return i;
            }
        }
        return -1;
    }

    public int maxArgs() {
        return args.size();
    }

    public void setProcedure(ARTGLLRDTHandle procedure) {
        this.procedure = procedure;
    }

    public ARTGLLRDTHandle getProcedure() {
        return this.procedure;
    }



}

