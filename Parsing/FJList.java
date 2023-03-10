import java.util.ArrayList;

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

