public class FJ {
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
	
	static Object plus(Object a, Object b) {
		try {
			 return (iv(a)
					+ iv(b));
		} 
		catch (Exception FjException) {
			try {
				return (dv(a)
						+ dv(b));
			}
		catch (Exception FjException2) {
			try {
				return (bv(a)
					   || bv(b));
			} 
		catch (Exception FJException3) {
				return (String) a + (String) b;
			}
		}
	}
	}
}