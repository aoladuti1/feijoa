public class FJTO {
    public String typeString; 
    public Object obj;
    public FJTypes type; 

    public FJTO(Object obj) { 
        this.typeString = "";
        this.obj = obj;
      }

    public FJTO(Object obj, FJTypes type, String typeString) { 
        this.type = type;
        this.typeString = typeString;
        this.obj = obj;
    }

    public FJTO(Object obj, FJTypes type) { 
        this.obj = obj;
        this.type = type;
        this.typeString = FJ.typeEnumToString(type);
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
}
