import java.util.ArrayList;
import java.util.HashMap;

public class FJArgStack {

	public static ArrayList<ArrayList<Object>> elements = new ArrayList<>();	

	public final static String NONE = "|__FJNOARG__|";
	
	public static final String defaultType = ""; // struct type currently in focus
	public static final Integer defaultArgIndex = -1;
	public static final Integer defaultArgCount = 0;
	public static final Integer defaultMaxArgs = 0;
	public static final Integer defaultObj = null;

	static HashMap<String, ArrayList<FJNamedObj>> structs
	= new HashMap<String, ArrayList<FJNamedObj>>();

	/* Declare a new struct type */
	static void declareStruct(String structID) throws Exception {
		if (structs.containsKey(structID)) {
			throw new Exception("Struct " + structID + " already defined.");
		} else {
			structs.put(structID, new ArrayList<FJNamedObj>());
		}
	}

	/* Add a default member variable to a struct type */
	static void addMember(
			String structID, String memberName, Object memberValue) {
		structs.get(structID).add(new FJNamedObj(memberName, memberValue));
	}

	private static ArrayList<Object> makeDefaults() {
		ArrayList<Object> arr = new ArrayList<>();
		arr.add(defaultType);
		arr.add(defaultArgIndex);
		arr.add(defaultArgCount);
		arr.add(defaultMaxArgs);
		arr.add(defaultObj);
		return arr;
	}

	public static void push(Object[] list) {
		ArrayList<Object> arr = new ArrayList<>();
		for (Object o : list) { arr.add(o); }
		elements.add(arr);
	}

	public static void push() {
		elements.add(makeDefaults());
	}
	
	public static ArrayList<Object> pop() {
		return elements.remove(elements.size()-1);
	}

	public static ArrayList<Object> top() {
		return elements.get(elements.size()-1);
	}

	public static Integer getMaxArgs() {
		return (Integer) top().get(3);
	}

	public static void startStructConstruction(String structType) {
		FJArgStack.push();
		FJArgStack.setType(structType);
		FJArgStack.setObj(new HashMap<String, Object>());
	}

	/***
	 * Returns the struct
	 * @return the struct
	 */
	@SuppressWarnings("unchecked")
	public static Object endStructConstruction() {
		int argi = getArgIndex();
		int maxArgs = FJArgStack.getMaxArgs();
		ArrayList<FJNamedObj> defaultMembers = structs.get(getType());
		HashMap<String, Object> newObj = (HashMap<String, Object>) FJArgStack.getObj();
		for (int i = argi + 1; i < maxArgs; i++) {
			FJNamedObj defaultMember = defaultMembers.get(i);
			newObj.put(defaultMember.name, defaultMember.obj);
		}
		FJArgStack.pop();
		return newObj;
	}

	@SuppressWarnings("unchecked")
	public static void processArg(Object arg) {
		ArrayList<FJNamedObj> defaultMembers = FJArgStack.getDefaultMembers();
		FJArgStack.incrArgIndex();
		String memberName;
		try {
		  memberName = defaultMembers.get(FJArgStack.getArgIndex()).name;
		} catch (Exception FJException) {
		  return;
		}
		HashMap<String, Object> newObj = (HashMap<String, Object>) getObj();
		newObj.put(memberName, arg);
	}

	/**
	 * Processes an argument and increases the argument index. Returns true if successful,
	 * otherwise calls {@code setArgCount(-1)} and returns false.
	 * @param arg the current argument Object
	 * @return true if successful, false otherwise
	 */
	@SuppressWarnings("unchecked")
	public static boolean processLastArg(Object arg) {
		ArrayList<FJNamedObj> defaultMembers = structs.get(getType());
		int maxArgs = getMaxArgs();
		boolean tooManyArgs = getArgCount() > maxArgs;
		if (!(NONE.equals(arg.toString()) || getArgIndex() >  maxArgs - 2) && !tooManyArgs) {
			incrArgIndex();
			String memberName = defaultMembers.get(getArgIndex()).name;
			HashMap<String, Object> varMembers = (HashMap<String, Object>) getObj();
			varMembers.put(memberName, arg);
		} else if (tooManyArgs) {
			setArgCount(-1);
		}
		return tooManyArgs;
	}
	
	public static void printErrMsg(String ID) {
		System.err.println(
			"ArgError: [" + ID + "] too many arguments for struct type " + getType()
		  + " (got " + getArgCount() + "; expected up to " + getMaxArgs() + ")");
	}

	/**
	* Will either reset the top of the stack to default values
	* or push an ArrayList of defaults if {@code elements} is empty.
	**/
	public static void resetTop() {
		int size = elements.size();
		if (size > 0) {
			elements.set(size - 1, makeDefaults());
		} else {
			push();
		}
	}
	public static void setType(Object type) {
		top().set(0, type);
		top().set(3, structs.get(getType()).size());
	}
	
	public static String getType() {
		return (String) top().get(0);
	}

	public static ArrayList<FJNamedObj> getDefaultMembers() {
		return structs.get(getType());
	}

	public static void setArgIndex(Object index) {
		top().set(1, index);
	}
		
	public static Integer getArgIndex() {
		return (Integer) top().get(1);
	}

	public static void setArgCount(Object count) {
		top().set(2, count);
	}
	
	public static Integer getArgCount() {
		return (Integer) top().get(2);
	}

	public static void setObj(Object o) {
		top().set(top().size() - 1, o);
	}

	public static Object getObj() {
		return top().get(top().size() - 1);
	}
	
	public static Integer incrArgIndex() {
		ArrayList<Object> t = top();
		Integer i = (Integer) t.get(1);
		Integer increase = i + 1;
		t.set(1, increase);
		return i;
	}

	public static Integer incrArgCount() {
		ArrayList<Object> t = top();
		Integer i = (Integer) t.get(2);
		Integer increase = i + 1;
		t.set(2, increase);
		return i;
	}





}