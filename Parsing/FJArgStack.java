import java.util.ArrayList;

public class FJArgStack {

	public static ArrayList<ArrayList<Object>> elements = new ArrayList<>();	
	
	public static String defaultCurType = ""; // struct type currently in focus
	public static String defaultCurID = ""; // current variable being assigned to
	public static Integer defaultArgIndex = -1;
	public static Integer defaultArgCount = 0;

	private static ArrayList<Object> makeDefaults() {
		ArrayList<Object> arr = new ArrayList<>();
		arr.add(defaultCurType);
		arr.add(defaultCurID);
		arr.add(defaultArgIndex);
		arr.add(defaultArgCount);
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
	public static void setCurType(Object type) {
		top().set(0, type);
	}
	
	@SuppressWarnings("unchecked")
	public static String getCurType() {
		return (String) top().get(0);
	}

	public static void setCurID(Object ID) {
		top().set(1, ID);
	}
	
	@SuppressWarnings("unchecked")
	public static String getCurID() {
		return (String) top().get(1);
	}

	public static void setArgIndex(Object index) {
		top().set(2, index);
	}
		
	@SuppressWarnings("unchecked")
	public static Integer getArgIndex() {
		return (Integer) top().get(2);
	}

	public static void setArgCount(Object count) {
		top().set(3, count);
	}
	
	@SuppressWarnings("unchecked")
	public static Integer getArgCount() {
		return (Integer) top().get(3);
	}
	
	@SuppressWarnings("unchecked")
	public static Integer incrArgIndex() {
		ArrayList<Object> t = top();
		Integer i = (Integer) t.get(2);
		Integer increase = i + 1;
		t.set(2, increase);
		return i;
	}

	@SuppressWarnings("unchecked")
	public static Integer incrArgCount() {
		ArrayList<Object> t = top();
		Integer i = (Integer) t.get(3);
		Integer increase = i + 1;
		t.set(3, increase);
		return i;
	}





}