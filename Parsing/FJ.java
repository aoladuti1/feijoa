import java.util.HashMap;
import java.util.ArrayList;

public class FJ {
	
	static HashMap<String, Object> symbols =
		new HashMap<String, Object>(); // key, value = identifier, value
		
	static HashMap<String, ArrayList<FJNamedObj>> structsMValues
		= new HashMap<String, ArrayList<FJNamedObj>>();

	final static String memberOp = ".";
	static String curdef = ""; // whatever struct/func is currently being defined
	static String curID = ""; // whatever  ID is currently being assigned to a struct/func
	static int argIndex = -1;
	static int argCount = 0;
	
	@SuppressWarnings("unchecked")
	public static Object getSymbol(String ID) {
		int dotIndex = ID.indexOf(memberOp);
		if (dotIndex == -1) {
			return symbols.get(ID);
		} else {
			HashMap<String, Object> subTable = 
				(HashMap<String, Object>) symbols.get(ID.substring(0, dotIndex));
			return subTable.get(ID.substring(dotIndex + 1));
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void putSymbol(String ID, Object value) {
		int dotIndex = ID.indexOf(memberOp);
		if (dotIndex == -1) {
			symbols.put(ID, value);
		} else {
			HashMap<String, Object> subTable = 
				(HashMap<String, Object>) symbols.get(ID.substring(0, dotIndex));
			subTable.put(ID.substring(dotIndex + 1), value);
		}
		
	}
	
	static void declareStruct(String structID) throws Exception {
		if (structsMValues.containsKey(structID)) {
			throw new Exception("Struct " + structID + " already defined.");
		} else {
			structsMValues.put(structID, new ArrayList<FJNamedObj>());
		}
	}
	
	static void addMember(
			String structID, String memberName, Object memberValue) {
		structsMValues.get(structID).add(new FJNamedObj(memberName, memberValue));
	}
	
	static Object getMember(String structID, int memberIndex) {
		return structsMValues.get(structID).get(memberIndex).obj;
	}
	
	static Object getMemberName(String structID, int memberIndex) {
		return structsMValues.get(structID).get(memberIndex).name;
	}	
	
	static Integer iv(Object obj) {
		return Integer.valueOf(obj.toString());
	}
	
	static Double dv(Object obj) {
		return Double.valueOf(obj.toString());
	}
	
	static Boolean bv(Object obj) {
		String s = obj.toString();
		if (s.equalsIgnoreCase("true"))
			return true;
		if (s.equalsIgnoreCase("false"))
			return false;
		throw new IllegalArgumentException();
	}

	
	static Object gtr(Object a, Object b) {
		try {
			return (Integer.compare(FJ.iv(a), FJ.iv(b))) > 0;
		} catch (Exception FjException) {
			return (Double.compare(FJ.dv(a), FJ.dv(b))) > 0;
		} 	
	}

	static Object equ(Object a, Object b) {
		try {
			return (Integer.compare(FJ.iv(a), FJ.iv(b))) == 0;
		} catch (Exception FjException) {
			return (Double.compare(FJ.dv(a), FJ.dv(b))) == 0;
		} 
	}
	
	static Object plus(Object a, Object b) {
		try {
			return iv(a) + iv(b);
		} catch (Exception FjException) {
			try {
				return dv(a) + dv(b);
			} catch (Exception FjException2) {
				try {
					return bv(a) || bv(b);
				} catch (Exception FJException3) {
					return a.toString() + b.toString();
				}
			}
		}
	}
	
	static Object minus(Object a, Object b) {
		try {
			return FJ.iv(a) - FJ.iv(b);
		} catch (Exception FjException) {
			try {
				return FJ.dv(a) - FJ.dv(b);
			} catch (Exception FJException2) {
				String str1 = (String) a;
				String str2 = (String) b;
				return str1.replace(str2, "");
			}
		}
	}
	
	static Object multiply(Object a, Object b) {
		try {
			return FJ.iv(a) * FJ.iv(b);
		} catch (Exception FjException) {
			try {
				return FJ.dv(a) * FJ.dv(b);
			} catch (Exception FJException2) {
				return (FJ.bv(a) && FJ.bv(b));
			}
		}
	}
	
	static Object exponentiate(Object a, Object b) {
		try {
			return Math.pow(FJ.iv(a), FJ.iv(b));
		} catch (Exception FjException) {
			return Math.pow(FJ.dv(a), FJ.dv(b));
		}
	}
}