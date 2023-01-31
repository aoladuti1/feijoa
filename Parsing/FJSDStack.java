import java.util.ArrayList;
import java.util.HashMap;

public class FJSDStack {

	private ArrayList<FJStructDef> stack = new ArrayList<>();

	public boolean containsID(String firstID) {
		if (stack.size() > 1) 
			return firstID.startsWith(stack.get(1).name);
		else 
			return false;
	}

	public String[] qualify(String[] splits) {
		int stackSize = stack.size();
		if (isEmpty()) { return splits; }
		String[] ret = new String[splits.length + stackSize];
		for (int i = stackSize; i < ret.length; i++) {
			ret[i] = splits[i - stackSize];
		}
		for (int i = 0; i < stackSize; i++) {
			ret[i] = getName(i);
		}
		return ret;
	}

	public boolean isLayered() {
		return stack.size() > 1;
	}
	public boolean isEmpty() { 
		return stack.isEmpty();
	}

	private String getName(int index) {
		return stack.get(index).name;
	}

	public String topID() {
		return top().name;
	}

	public HashMap<String, Object> topTable() {
		if (!stack.isEmpty()) {
			return top().members; 
		} else {
			return null;
		}
		
	}

	public HashMap<String, Object> bottomTable() {
		if (!stack.isEmpty()) {
			return stack.get(0).members; 
		} else {
			return null;
		}
		
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, Object> findTable(String[] IDSplits) {
		HashMap<String, Object> ret = bottomTable();
		HashMap<String, Object> last = null;
		for (int i = 0; i < IDSplits.length; i++) {
			last = ret;
			ret = (HashMap<String, Object>) ret.get(IDSplits[i]);
			if (ret == null) {
				return last;
			}
		}
		return ret;
	}

	/* Declare a new struct type */
	void declare(FJStructDef sDef) {
		stack.add(sDef);
	}

	// if the class is static put the whole definition in as an object
	void finish() {
		stack.remove(stack.size() - 1);
	}

	public FJStructDef top() {
		return stack.get(stack.size() - 1);
	}

	public FJStructDef bottom() {
		return stack.get(0);
	}

	/* Add a default member variable to a struct type */
	public void addMember(String ID, Object o) {
		top().addMember(ID, o);
	}








}