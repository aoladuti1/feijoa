public class FJNamedObj { 
  public final String name; 
  public final Object obj;
  
  public FJNamedObj(String name, Object obj) { 
    this.name = name;
    this.obj = obj;
  } 

  @Override
  public String toString() {
      return name + "=" + obj;
  }
  
} 