import java.util.HashMap;
import java.util.ArrayList;

public class FJ {
	
	static HashMap<String, HashMap<String, Object>> structsMNames 
		= new HashMap<String, HashMap<String, Object>>();
	static HashMap<String, ArrayList<Object>> structsMValues
		= new HashMap<String, ArrayList<Object>>();

	static String curdef = ""; // whatever struct/func is currently being defined
	
	static void declareStruct(String structID) throws Exception {
		if (structsMValues.containsKey(structID)) {
			throw new Exception("Struct " + structID + " already defined.");
		} else {
			structsMValues.put(structID, new ArrayList<Object>());
			structsMNames.put(structID, new HashMap<String, Object>());
		}
	}
	
	static void addMember(
			String structID, String memberName, Object memberValue) {
		structsMValues.get(structID).add(memberValue);
		structsMNames.get(structID).put(memberName, memberValue);
	}
	
	static Object getMember(String structID, String memberName) {
		return structsMNames.get(structID).get(memberName);
	}
	
	static Object getMember(String structID, int memberIndex) {
		return structsMValues.get(structID).get(memberIndex);
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
					return (String) a + (String) b;
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