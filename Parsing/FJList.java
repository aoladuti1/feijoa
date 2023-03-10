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

    public FJTO FJequals(FJTO o) {
        FJList list = (FJList) o.obj;
        if (!o.isList()) {
            return FJ.newBoolean(false);    
        }
        if (this.size() != list.size()) {
            return FJ.newBoolean(false);
        }
        if (this.isEmpty() && list.isEmpty()) {
            return FJ.newBoolean(true);
        }
        FJTO ret = FJ.newBoolean(true);
        for (int i = 0; i < this.size(); i++) {
            if (((boolean) FJ.equ(this.get(i), list.get(i)).obj) == false)
                ret = FJ.newBoolean(false);
        }
        return ret;

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

