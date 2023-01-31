import java.util.ArrayList;
import java.util.HashMap;

public class FJStructDef {
    String name;
    HashMap<String, Object> members = new HashMap<>();
    ArrayList<String> memberOrder = new ArrayList<>();
    
    public FJStructDef(String typeName) {
        this.name = typeName;
    }

    public void addMember(String ID, Object o) {
        if (!members.containsKey(ID)) {
            try {
                FJStructDef _fjsd = (FJStructDef) o;
            } catch (Exception FJ_Exception) {
                this.memberOrder.add(ID);
            } finally {
                this.members.put(ID, o); 
            }
        } else {
            this.members.put(ID, o);    
        }
    }

    public void addStructDef(String ID, Object o) {
        this.members.put(ID, o);
    }

    public Object getMember(String ID) {
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

    public Object getDefault(int index) {
        return members.get(getArgName(index));
    }

    public Object getDefault(String ID) {
        return members.get(ID);
    }

    public int maxArgs() {
        return this.memberOrder.size();
    }
    
    
}
