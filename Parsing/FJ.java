import java.util.HashMap;

public class FJ {
	
	static FJTO newInt(int value) {
		return new FJTO(value, FJTypes.INT);
	}

	static FJTO newDouble(double value) {
		return new FJTO(value, FJTypes.DOUBLE);
	}

	static FJTO newBoolean(boolean value) {
		return new FJTO(value, FJTypes.BOOLEAN);
	}

	static FJTO newFunction(FJFunction value) {
		return new FJTO(value, FJTypes.FUNCTION);
	}

	static FJTO newString(String value) {
		return new FJTO(value, FJTypes.STRING);
	}

	static FJTO newStruct(HashMap<String, FJTO> value, String name) {
		return new FJTO(value, FJTypes.STRUCT, name);
	}

	static FJTO newNull() {
		return new FJTO(null, FJTypes.NULL);
	}

	static FJTO newList() {
		return new FJTO(new FJList(), FJTypes.LIST);
	}

	static FJTO newList(FJList value) {
		return new FJTO(value, FJTypes.LIST);
	}

	static String type(FJTO a) {
		if (a.type == FJTypes.STRUCT) { return a.typeString; }
		return typeEnumToString(a.type);
	}

	public static String typeEnumToString(FJTypes t) {
		switch (t) {
			case BOOLEAN:
				return "boolean";
			case DOUBLE:
				return "double";
			case FUNCTION:
				return "function";
			case INT:
				return "int";
			case NULL:
				return "null";
			case STRING:
				return "string";
			case STRUCT:
				return "struct";
			case STRUCT_DEF:
				return "struct_definition";
			case LIST:
				return "list";
		}
		return "??????";
	}

	static FJTO toInt(FJTO a) {
		return newInt(Integer.parseInt(a.obj.toString()));
	}

	static FJTO toDouble(FJTO a) {
		return newDouble(Double.parseDouble(a.obj.toString()));
	}

	static FJTO toString(FJTO a) {
		return newString(a.obj.toString());
	}

	static FJTO toBoolean(FJTO a) {
		return newBoolean(Boolean.parseBoolean(a.obj.toString()));
	}

	static Integer iv(FJTO o) {
		return Integer.valueOf(o.obj.toString());
	}
	
	static Double dv(FJTO o) {
		return Double.valueOf(o.obj.toString());
	}

	static int numericCompare(FJTO a, FJTO b) {
		if (a.type == FJTypes.DOUBLE || b.type == FJTypes.DOUBLE) {
			double ao = (double) a.obj;
			double bo = (double) b.obj;
			if (ao > bo) return 1;
			if (ao == bo) return 0;
			if (ao < bo) return -1;
		} else {
			int ao = (int) a.obj;
			int bo = (int) b.obj;
			if (ao > bo) return 1;
			if (ao == bo) return 0;
			if (ao < bo) return -1;
		}
		return -2;
	}
	
	static int safeNumericCompare(FJTO a, FJTO b) {
		if (!(a.isNumeric() && b.isNumeric())) 
			return -2;
		else
			return numericCompare(a, b);
	}

	static void append(FJTO a, FJTO b) {
		((FJList) a.obj).add(b);
	} 

	static void add(FJTO a, FJTO b, FJTO c) {
		((FJList) a.obj).add((int) b.obj, c);
	} 

	static FJTO remove(FJTO a, FJTO b) {
		return ((FJList) a.obj).remove((int) b.obj);
	}

	static FJTO len(FJTO a) {
		if (a.isList())
			return newInt(((FJList) a.obj).size());
		if (a.isString())
			return newInt(((String) a.obj).length());
		else
			return null; //err
	}
	
	static Boolean bv(Object obj) {
		String s = obj.toString();
		if (s.equalsIgnoreCase("true"))
			return true;
		if (s.equalsIgnoreCase("false"))
			return false;
		throw new IllegalArgumentException();
	}

	
	static FJTO gtr(FJTO a, FJTO b) {
		return newBoolean(safeNumericCompare(a, b) == 1);
	}
	
	static FJTO lss(FJTO a, FJTO b) {
		return newBoolean(safeNumericCompare(a, b) == -1);
	}

	static FJTO not(FJTO a) {
		if (a.isBoolean()) {
			return newBoolean(!((boolean) a.obj));
		} else {
			return null; //err
		}
	}

	static FJTO and(FJTO a, FJTO b) {
		if (a.isBoolean() && b.isBoolean()) {
			return newBoolean(((boolean) a.obj) && ((boolean) b.obj));
		} else {
			return newBoolean(false);
		}
	}

	static FJTO or(FJTO a, FJTO b) {
		if (a.isBoolean() && b.isBoolean()) {
			return newBoolean(((boolean) a.obj) || ((boolean) b.obj));
		} else if (a.isBoolean()) {
			return newBoolean((boolean) a.obj);
		} else if (b.isBoolean()) {
			return newBoolean((boolean) b.obj);
		} else {
			return newBoolean(false);
		}
	}

	static FJTO equ(FJTO a, FJTO b) {
		if (a.obj == null || b.obj == null) 
			return newBoolean(a.obj == b.obj);
		if (a.type != b.type)
			return newBoolean(false);
		if (a.isNumeric() && b.isNumeric()) {
			return newBoolean(numericCompare(a, b) == 0);
		} else if (a.type == FJTypes.STRING) {
			return newBoolean(((String) a.obj).equals((String) b.obj));
		} else {
			return newBoolean(false);
		}
	}
	
	static FJTO plus(FJTO a, FJTO b) {
		if (a.type == FJTypes.INT && b.type == FJTypes.INT) {
			return newInt((int) a.obj + (int) b.obj);
		} else if ((a.type == FJTypes.DOUBLE && b.isNumeric())
				|| (b.type == FJTypes.DOUBLE && a.isNumeric())) {
			return newDouble(Double.valueOf(a.obj.toString()) 
						  +  Double.valueOf(b.obj.toString()));
		} else if (a.isBoolean() && b.isBoolean()) {
			return newBoolean((boolean) a.obj || (boolean) b.obj);
		} else if (a.type == FJTypes.STRING) {
			return newString(a.obj.toString() + b.obj.toString());
		} else if (b.type == FJTypes.STRING) {
			return newString(a.obj.toString() + b.obj.toString());
		} else if (a.isList() && b.isList()) {
			FJList al = (FJList) a.obj;
			FJList bl = (FJList) b.obj;
			FJList ret = new FJList(al.size() + bl.size());
			ret.addAll(al);
			ret.addAll(bl);
			return newList(ret);
		} else {
			return null; //error
		}
	}

	static FJTO minus(FJTO a, FJTO b) {
		if (a.type == FJTypes.INT && b.type == FJTypes.INT) {
			return newInt((int) a.obj - (int) b.obj);
		} else if ((a.type == FJTypes.DOUBLE && b.isNumeric())
				|| (b.type == FJTypes.DOUBLE && a.isNumeric())) {
			return newDouble(Double.valueOf(a.obj.toString()) 
						  -  Double.valueOf(b.obj.toString()));
		} else if (a.type == FJTypes.STRING && b.type == FJTypes.STRING) {
			return newString(((String) a.obj).replace((String) b.obj, ""));
		} else {
			return null; //err
		}
	}

	static FJTO negate(FJTO a) {
		if (a.type == FJTypes.INT) {
			return newInt(-1 * (int) a.obj);
		} else if (a.type == FJTypes.DOUBLE) {
			return newDouble(-1 * (double) a.obj);
		} else {
			return null; //err
		}
	}
	
	static FJTO multiply(FJTO a, FJTO b) {
		if (a.type == FJTypes.DOUBLE || b.type == FJTypes.DOUBLE) {
			return newDouble(Double.valueOf(a.obj.toString()) 
						   * Double.valueOf(b.obj.toString()));
		} else if (a.type == FJTypes.INT && b.type == FJTypes.INT) {
			return newInt((int) a.obj * (int) b.obj);
		} else if (a.isBoolean() && b.isBoolean()) {
			return newBoolean(((boolean) a.obj) && ((boolean) b.obj));
		} else {
			return null; // error
		}
	}
	
	static FJTO divide(FJTO a, FJTO b) {
		if (a.type == FJTypes.DOUBLE || b.type == FJTypes.DOUBLE) {
			return newDouble(Double.valueOf(a.obj.toString()) 
						   / Double.valueOf(b.obj.toString()));
		} else if (a.type == FJTypes.INT && b.type == FJTypes.INT) {
			return newInt((int) a.obj / (int) b.obj);
		} else {
			return null; // error
		}
	}
	
	static FJTO exponentiate(FJTO a, FJTO b) {
		if (a.isNumeric() && b.isNumeric()) {
			return newDouble(
				Math.pow(Double.valueOf(a.obj.toString()), 
						 Double.valueOf(b.obj.toString())));
		} else {
			return null; // error
		}
	}

}