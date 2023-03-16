import java.util.HashMap;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.ARTGLLRDTHandle; 

/***
 * General factory-style helper class for constructing new objects
 * out of operators and built-in functions
 */
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
				return null; // this line should never run
			case STRUCT_DEF:
				return "struct_definition";
			case LIST:
				return "list";
		}
		return "??????";
	}

	static FJTO toInt(FJTO a) {
		if (a.isDouble()) {
			return newInt(((Double) a.obj).intValue());
		} else if (a.isString()) {
			return newInt(Integer.parseInt(a.obj.toString()));
		} else if (a.isInt()) {
			return a;
		} else {
			return null; // error
		}
	}

	static FJTO toDouble(FJTO a) {
		if (a.isInt() || a.isString()) {
			return newDouble(Double.parseDouble(a.obj.toString()));
		} else if (a.isDouble()) {
			return a;
		} else {
			return null; // error
		}
	}

	static FJTO toString(FJTO a) {
		return newString(a.obj.toString());
	}

	static FJTO toBoolean(FJTO a) {
		if (a.isString()) {
			return newBoolean(Boolean.parseBoolean(a.obj.toString()));
		} else {
			return null; // error
		}
	}

	/***
	 * Returns 0 if a == b. Returns 1 if a > b. Returns -1 if a < b.
	 * Returns -2 if there is an error.
	 * @param a number a
	 * @param b number b
	 * @return 0 if a == b. Returns 1 if a > b. Returns -1 if a < b.
	 * Returns -2 if there is an error.
	 */
	static int numericCompare(FJTO a, FJTO b) {
		if (doublePresent(a, b)) {
			Double ao;
			Double bo;
			if (a.isDouble()) {
				ao = ((Double) a.obj);
			} else if (a.isInt()) {
				ao = Double.valueOf(a.obj.toString());
			} else {
				return -2; // error;
			}
			if (b.isDouble()) {
				bo = ((Double) b.obj);
			} else if (b.isInt()) {
				bo = Double.valueOf(b.obj.toString());
			} else {
				return -2; // error;
			}
			int ret = ao.compareTo(bo);
			if (ret < 0) ret = -1; // future-proofing
			return ret;
		} else {
			int ao = (int) a.obj;
			int bo = (int) b.obj;
			if (ao > bo) return 1;
			if (ao == bo) return 0;
			if (ao < bo) return -1;
		}
		return -2; // error
	}
	
	/***
	 * Checks if both arguments are numeric and returns -2 if not.
	 * Returns 0 if a == b. Returns 1 if a > b. Returns -1 if a < b.
	 * Returns -2 if there is an error.
	 * @param a number a
	 * @param b number b
	 * @return 0 if a == b. Returns 1 if a > b. Returns -1 if a < b.
	 * Returns -2 if there is an error.
	 */
	static int safeNumericCompare(FJTO a, FJTO b) {
		if (!(a.isNumeric() && b.isNumeric())) 
			return -2;
		else
			return numericCompare(a, b);
	}

	private static boolean doublePresent(FJTO a, FJTO b) {
		return a.isDouble() || b.isDouble();
	}
	private static boolean bothInts(FJTO a, FJTO b) {
		return a.isInt() && b.isInt();
	}

	// append b to a
	static void append(FJTO a, FJTO b) {
		if (a.isList()) {
			((FJList) a.obj).add(b);
		} else {
			return; // error
		}
	} 

	// add c to index i of a
	static void add(FJTO a, FJTO i, FJTO c) {
		if (a.isList() & i.isInt()) {
			((FJList) a.obj).add((int) i.obj, c);
		} else {
			return; // error
		}
	} 

	// remove the object at index b from a
	static FJTO remove(FJTO a, FJTO b) {
		if (a.isList() && b.isInt()) {
			return ((FJList) a.obj).remove((int) b.obj);
		} else {
			return null; // error
		}
	}

	// returns the length of a list or string
	static FJTO len(FJTO a) {
		if (a.isList()) {
			return newInt(((FJList) a.obj).size());
		} else if (a.isString()) {
			return newInt(((String) a.obj).length());
		} else {
			return null; // error
		}
	}
	
	// returns a > b 
	static FJTO gtr(FJTO a, FJTO b) {
		int comp = safeNumericCompare(a, b);
		if (comp == -2)
			return null; // error
		else
			return newBoolean(safeNumericCompare(a, b) == 1);
	}

	// returns a >= b
	static FJTO geq(FJTO a, FJTO b) {
		int comp = safeNumericCompare(a, b);
		if (comp == -2)
			return null; // error
		else
			return newBoolean(comp == 1 || comp == 0);
	}
	
	// returns a < b
	static FJTO lss(FJTO a, FJTO b) {
		int comp = safeNumericCompare(a, b);
		if (comp == -2)
			return null; // error
		else
			return newBoolean(safeNumericCompare(a, b) == -1);
	}

	// returns a <= b
	static FJTO leq(FJTO a, FJTO b) {
		int comp = safeNumericCompare(a, b);
		if (comp == -2)
			return null; // error
		else
			return newBoolean(comp == -1 || comp == 0);
	}

	// returns !a
	static FJTO not(FJTO a) {
		if (a.isBoolean()) {
			return newBoolean(!((boolean) a.obj));
		} else {
			return null; // error
		}
	}

	// returns a && b
	static FJTO and(FJTO a, FJTO b) {
		if (a.isBoolean() && b.isBoolean()) {
			return newBoolean(((boolean) a.obj) && ((boolean) b.obj));
		} else {
			return null; // error
		}
	}

	// returns a || b
	static FJTO or(FJTO a, FJTO b) {
		if (a.isBoolean() && b.isBoolean()) {
			return newBoolean(((boolean) a.obj) || ((boolean) b.obj));
		} else if (a.isBoolean()) {
			return newBoolean((boolean) a.obj);
		} else if (b.isBoolean()) {
			return newBoolean((boolean) b.obj);
		} else {
			return null; // error
		}
	}

	// returns a == b (value equality, not object address)
	static FJTO equ(FJTO a, FJTO b) {
		// note: change ret type to primitive boolean when err handling present
		Boolean ret = booleanEqu(a, b);
		return ret == null ? null : newBoolean(ret);
	}
	
	// returns a == b as a Boolean
	static Boolean booleanEqu(FJTO a, FJTO b) { 
		// note: change return type to primitive boolean when err handling present
		if (a.isNull()|| b.isNull()) 
			return a.obj == b.obj;
		if (a.type != b.type)
			return false;
		if (a.isNumeric() && b.isNumeric()) {
			return numericCompare(a, b) == 0;
		} else if (a.isString()) {
			return ((String) a.obj).equals((String) b.obj);
		} else if (a.isList()) {
			return ((FJList) a.obj).booleanEqu(b);
		} else {
			return null; // error
		}
	}
	
	// returns a + b
	static FJTO plus(FJTO a, FJTO b) {
		if (bothInts(a, b)) {
			return newInt((int) a.obj + (int) b.obj);
		} else if ((a.isDouble() && b.isNumeric())
				|| (b.isDouble() && a.isNumeric())) {
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
			return null; // error
		}
	}

	// returns a - b
	static FJTO minus(FJTO a, FJTO b) {
		if (bothInts(a,b)) {
			return newInt((int) a.obj - (int) b.obj);
		} else if ((a.isDouble() && b.isNumeric())
				|| (b.isDouble() && a.isNumeric())) {
			return newDouble(Double.valueOf(a.obj.toString()) 
						  -  Double.valueOf(b.obj.toString()));
		} else if (a.isString() && b.isString()) {
			return newString(((String) a.obj).replace((String) b.obj, ""));
		} else {
			return null; // error
		}
	}

	// returns -a
	static FJTO negate(FJTO a) {
		if (a.isInt()) {
			return newInt(-1 * (int) a.obj);
		} else if (a.isDouble()) {
			return newDouble(-1 * (double) a.obj);
		} else {
			return null; // error
		}
	}
	
	// returns a * b
	static FJTO multiply(FJTO a, FJTO b) {
		if (doublePresent(a, b)) {
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

	// returns a % b
	static FJTO mod(FJTO a, FJTO b) {
		if (doublePresent(a, b)) {
			return newDouble(Double.valueOf(a.obj.toString()) 
						   % Double.valueOf(b.obj.toString()));
		} else if (a.type == FJTypes.INT && b.type == FJTypes.INT) {
			return newInt((int) a.obj % (int) b.obj);
		} else {
			return null; // error
		}
	}
	
	// returns a / b
	static FJTO divide(FJTO a, FJTO b) {
		if (doublePresent(a, b)) {
			return newDouble(Double.valueOf(a.obj.toString()) 
						   / Double.valueOf(b.obj.toString()));
		} else if (a.type == FJTypes.INT && b.type == FJTypes.INT) {
			return newInt((int) a.obj / (int) b.obj);
		} else {
			return null; // error
		}
	}
	
	// returns a ** b
	// return type is a double 
	// unless two integers are the operands AND the exponent is nonnegative
	static FJTO exponentiate(FJTO a, FJTO b) {
		if (doublePresent(a, b)) {
			return newDouble(
				Math.pow(Double.valueOf(a.obj.toString()), 
						 Double.valueOf(b.obj.toString())));
		} else if (a.type == FJTypes.INT && b.type == FJTypes.INT) {
			int bInt = (int) b.obj;
			if (bInt > 0)
				return newInt(
						(int) Math.pow(Double.valueOf(a.obj.toString()), 
							Double.valueOf(b.obj.toString())));
			else if (bInt == 0)
				return newInt(1);
			else 
				return newDouble(
					Math.pow(Double.valueOf(a.obj.toString()), 
							Double.valueOf(b.obj.toString())));
		} else {
			return null; // error
		}
	}

	// returns a[b]
	static FJTO subscript(FJTO a, FJTO b) {
		if (a.isList()) {
			if (b.isInt())
				return ((FJList) a.obj).get((Integer) b.obj); 
			else if (b.isList())
				return ((FJList) a.obj).getIndices(b);
		} else if (a.isString() && b.isInt()) {
			return newString(((String) a.obj).charAt((Integer) b.obj) + "");
		}
		return null; // error
	}

	// assign b to a[i]
	static void listEquals(FJTO a, FJTO i, FJTO b) {
		if (a.isList() && i.isInt()) {
			Integer index = (Integer) i.obj;
			((FJList) a.obj).set(index, b);
		} else if (a.isString()) {
			System.err.println("String index assignment is not supported.");
			return; // error
		} else {
			return; // error
		}
	}

	// assign a[i] + b to a[i]
	static void listPlusEquals(FJTO a, FJTO i, FJTO b) {
		if (a.isList() && i.isInt()) {
			Integer index = (Integer) i.obj;
			FJList list = (FJList) a.obj;
			list.set(index, FJ.plus(list.get(index), b));
		} else {
			return; // error
		}
	}

	// assign a[i] - b to a[i]
	static void listMinusEquals(FJTO a, FJTO i, FJTO b) {
		if (a.isList() && i.isInt()) {
			Integer index = (Integer) i.obj;
			FJList list = (FJList) a.obj;
			list.set(index, FJ.minus(list.get(index), b));
		} else {
			return; // error
		}
	}

	// assign a[i] * b to a[i]
	static void listMultiplyEquals(FJTO a, FJTO i, FJTO b) {
		if (a.isList() && i.isInt()) {
			Integer index = (Integer) i.obj;
			FJList list = (FJList) a.obj;
			list.set(index, FJ.multiply(list.get(index), b));
		} else {
			return; // error
		}
	}

	// assign a[i] / b to a[i]
	static void listDivideEquals(FJTO a, FJTO i, FJTO b) {
		if (a.isList() && i.isInt()) {
			Integer index = (Integer) i.obj;
			FJList list = (FJList) a.obj;
			list.set(index, FJ.divide(list.get(index), b));
		} else {
			return; // error
		}
	}

	// assign a[i] % b to a[i]
	static void listModEquals(FJTO a, FJTO i, FJTO b) {
		if (a.isList() && i.isInt()) {
			Integer index = (Integer) i.obj;
			FJList list = (FJList) a.obj;
			list.set(index, FJ.mod(list.get(index), b));
		} else {
			return; // error
		}
	}

	// assign a[i] ** b to a[i]
	static void listExponentiateEquals(FJTO a, FJTO i, FJTO b) {
		if (a.isList() && i.isInt()) {
			Integer index = (Integer) i.obj;
			FJList list = (FJList) a.obj;
			list.set(index, FJ.exponentiate(list.get(index), b));
		} else {
			return; // error
		}
	}

	// define a function
	static void defFunc(ARTGLLRDTHandle procedure, FJFuncStack funcStack, FJCallStack callStack, FJSymbols symbols) {
		FJTO func = constructLambda(procedure, funcStack, callStack);
		symbols.put(((FJFunction) func.obj).name, func);
	}

	// construct a lambda
	static FJTO constructLambda(ARTGLLRDTHandle procedure, FJFuncStack funcStack, FJCallStack callStack) {
		if (callStack.current() != null) {
			funcStack.top().setOuterTables(callStack.current().funcVars);
		}
		funcStack.top().setProcedure(procedure);
		return newFunction(funcStack.pop());
	}

	// returns true if b exists in string / list a, false otherwise
	static FJTO in(FJTO a, FJTO b) {
		if (b.isList()) {
			return ((FJList) b.obj).FJcontains(a);
		} else if (b.isString()) {
			return newBoolean(((String) b.obj).contains(a.obj.toString()));
		} else {
			return null; // error
		}
	}
}	