import java.util.ArrayList;
import java.util.HashMap;

/***
 * Struct definition - underlying Feijoan object
 */
public class FJStructDef {
    String name;
    HashMap<String, FJTO> members = new HashMap<>();
    ArrayList<String> memberOrder = new ArrayList<>();
    
    public FJStructDef(String typeName) {
        this.name = typeName;
    }

    public void addMember(String ID, FJTO o) {
        if (!members.containsKey(ID)) {
            if (o.type != FJTypes.STRUCT_DEF) {
                this.memberOrder.add(ID);
            }
        }
        this.members.put(ID, o);    
    }

    public FJTO getMember(String ID) {
        return this.members.get(ID);
    }

    public String getArgName(int index) {
        return memberOrder.get(index);
    }

    public int getArgIndex(String ID) {
        for (int i = 0; i < maxArgs(); i++) {
            if (ID.equals(memberOrder.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public FJTO getDefault(int index) {
        return members.get(getArgName(index));
    }

    public FJTO getDefault(String ID) {
        return members.get(ID);
    }

    public int maxArgs() {
        return this.memberOrder.size();
    }
    
    @Override
    public String toString() {
        return this.members.toString();
    }
    
}
