import java.util.ArrayList;

public class FJList extends ArrayList<FJTO> {

    @java.io.Serial
    private static final long serialVersionUID = 8683452581122892190L;

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < this.size() - 1; i++) {
            ret += get(i).obj.toString() + ", ";
        }
        if (this.size() > 1) {
            ret += get(size() - 1).obj.toString();
        }
        return "[" + ret + "]";
    }
}

