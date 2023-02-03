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

	
	static Object gtr(Object a, Object b) {
		try {
			return (Integer.compare(FJ.iv(a), FJ.iv(b))) > 0;
		} catch (Exception FjException) {
			return (Double.compare(FJ.dv(a), FJ.dv(b))) > 0;
		} 	
	}
	
	static Object lss(Object a, Object b) {
		try {
			return (Integer.compare(FJ.iv(a), FJ.iv(b))) < 0;
		} catch (Exception FjException) {
			return (Double.compare(FJ.dv(a), FJ.dv(b))) < 0;
		} 	
	}

	static Boolean equ(Object a, Object b) {
		if (a == null || b == null) 
			return a == b;
		try {
			return FJ.iv(a).equals(b);
		} catch (Exception FjException) {
			try {
				return FJ.dv(a).equals(b);
			}
			catch (Exception fJException2) {
				try {
					return bv(a).equals(b);
				} 	catch (Exception fjException3) {
					return false;
				}
			}

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
	
	static Object divide(Object a, Object b) {
		try {
			return FJ.iv(a) / FJ.iv(b);
		} catch (Exception FjException) {
			return FJ.dv(a) / FJ.dv(b);
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