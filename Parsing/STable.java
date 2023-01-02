import java.util.HashMap;
import java.util.LinkedList;

class STable {

    private LinkedList<HashMap<String, Object>> tree
        = new LinkedList<>();

    final static String memberOp = ".";

    private int level = 0;

    private HashMap<String, Object> currentTable() {
        return getTable(level);
    }

    private HashMap<String, Object> getTable(int level) {
        return tree.get(level);
    }

    public STable() {
        tree.add(new HashMap<>());        
    }
    
    public HashMap<String, Object> newScope() {
        level += 1;
        tree.add(new HashMap<>());
        return currentTable();
    }

    public HashMap<String, Object> oldScope() {
        tree.removeLast();
        level -= 1;
        return currentTable();
    }

    public int levelOf(String ID) {
        return levelOf(ID, ID.indexOf(memberOp));
    }

    public int levelOf(String ID, int memOpIndex) {
        boolean found = false;
        int curLevel = level;
        for (;found != true && curLevel != -1; curLevel -= 1) {
            HashMap<String, Object> symbols = getTable(curLevel);
            if (memOpIndex == -1) {
                found = symbols.containsKey(ID);
            } else {
                found = symbols.containsKey(ID.substring(0, memOpIndex));
            }
        }
        if (found == true) { curLevel++; }
        return curLevel;
    }


	@SuppressWarnings("unchecked")
    public Object get(String ID) {
        int dotIndex = ID.indexOf(memberOp);
        int varLevel = levelOf(ID, dotIndex);
        if (varLevel < 0) {
            System.err.println("Cannot find the symbol " + ID);
            return null;
        }
        HashMap<String, Object> symbols = getTable(varLevel);
        if (dotIndex == -1) {
            return symbols.get(ID);
        } else {
            HashMap<String, Object> subTable = 
                (HashMap<String, Object>) symbols.get(ID.substring(0, dotIndex));
            return subTable.get(ID.substring(dotIndex + 1));
        }
    }

	@SuppressWarnings("unchecked")
	public void put(String ID, Object value) {
        int dotIndex = ID.indexOf(memberOp);
        int varLevel = levelOf(ID, dotIndex);
        if (varLevel < 0) {
            varLevel = level;
        }
        HashMap<String, Object> symbols = getTable(varLevel);
		if (dotIndex == -1) {
			symbols.put(ID, value);
		} else {
			HashMap<String, Object> subTable = 
				(HashMap<String, Object>) symbols.get(ID.substring(0, dotIndex));
			subTable.put(ID.substring(dotIndex + 1), value);
		}
		
	}

    // search and destroy. will look on all levels for the variable
    @SuppressWarnings("unchecked")
    public Object remove(String ID) {
        int dotIndex = ID.indexOf(memberOp);
        int varLevel = levelOf(ID, dotIndex);
        if (varLevel < 0) {
            varLevel = level;
        }
        HashMap<String, Object> symbols = getTable(varLevel);
		if (dotIndex == -1) {
			return symbols.remove(ID);
		} else {
			HashMap<String, Object> subTable = 
				(HashMap<String, Object>) symbols.get(ID.substring(0, dotIndex));
			return subTable.remove(ID.substring(dotIndex + 1));
		}
    }

}