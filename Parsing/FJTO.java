/***
 * This class is a minor abstraction of the Object class
 * used as the basis of every Feijoan object.
 */
public class FJTO {
    public String typeString; // for structs (not primitives) 
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

    @Override
    public String toString() {
        return this.obj.toString();
    }

    public boolean isNumeric() {
        return this.type == FJTypes.DOUBLE || this.type == FJTypes.INT;
    }

    public boolean isInt() {
        return this.type == FJTypes.INT;
    }

    public boolean isDouble() {
        return this.type == FJTypes.DOUBLE;
    }

    public boolean isNull() {
        return this.type == FJTypes.NULL;
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
