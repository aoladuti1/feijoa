public class FJTO {
    public String typeString; // for structs etc. 
    public Object obj;
    public FJTypes type; 

    public FJTO(Object obj) { 
        this.obj = obj;
      }

    public FJTO(Object obj, FJTypes type, String structType) { 
        this.type = type;
        this.typeString = structType;
        this.obj = obj;
    }

    public FJTO(Object obj, FJTypes type) { 
        this.obj = obj;
        this.type = type;
    }

    public boolean isNumeric() {
        return this.type == FJTypes.DOUBLE || this.type == FJTypes.INT;
    }

    public boolean isBoolean() {
        return this.type == FJTypes.BOOLEAN;
    }

    public boolean isList() {
        return this.type == FJTypes.LIST;
    }

    public boolean isString() {
        return this.type == FJTypes.STRING;
    }
}
