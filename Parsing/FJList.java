import java.util.ArrayList;

/***
 * Underlying object for Feijoa lists
 */
public class FJList extends ArrayList<FJTO> {

    @java.io.Serial
    private static final long serialVersionUID = 8683452581122892190L;

    public FJList(int num) {
        super(num);
    }

    public FJList(FJList c) {
        super(c);
    }

    public FJList() {
        super();
    }

    public boolean booleanEqu(FJTO o) {
        FJList list = (FJList) o.obj;
        if (!o.isList()) {
            return false;    
        }
        if (this.size() != list.size()) {
            return false;
        }
        if (this.isEmpty() && list.isEmpty()) {
            return true;
        }
        boolean ret = true;
        for (int i = 0; i < this.size(); i++) {
            if (FJ.booleanEqu(this.get(i), list.get(i)) == false)
                ret = false;
        }
        return ret;
    }

    public boolean equ(FJTO o) {
        return booleanEqu(o);
    }

    public FJTO FJcontains(FJTO o) {
        for (int i = 0; i < this.size(); i++) {
            if (FJ.booleanEqu(this.get(i), o) == true)
                return FJ.newBoolean(true);
        }
        return FJ.newBoolean(false);
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < this.size() - 1; i++) {
            Object obj = get(i).obj;
            if (obj != null)    
                ret += obj.toString() + ", ";
            else
                ret = "null, ";
        }
        if (this.size() >= 1) {
            Object obj = get(size() - 1).obj;
            if (obj != null)   
                ret += obj.toString();
            else
                ret += "null";
        }
        return "[" + ret + "]";
    }

}

