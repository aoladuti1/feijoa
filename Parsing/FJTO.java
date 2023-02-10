public class FJTO {
    public String structName; 
    public Object obj;
    public FJTypes type; 

    public FJTO(Object obj) { 
        this.structName = "";
        this.obj = obj;
      }

    public FJTO(String structName, Object obj, FJTypes type) { 
        this.structName = structName;
        this.obj = obj;
        this.type = type;
    }

    public FJTO(Object obj, FJTypes type) { 
        this.structName = "";
        this.obj = obj;
        this.type = type;
    }

    public boolean isNumeric() {
        return this.type == FJTypes.DOUBLE || this.type == FJTypes.INT;
    }

    public boolean isBoolean() {
        return this.type == FJTypes.BOOLEAN;
    }
}
