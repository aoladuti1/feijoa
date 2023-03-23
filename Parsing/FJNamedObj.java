/***
 * Used to represent function arguments
 */

public class FJNamedObj { 
  public final String name; 
  public final FJTO ftjo;
  
  public FJNamedObj(String name, FJTO ftjo) { 
    this.name = name;
    this.ftjo = ftjo;
  } 

  @Override
  public String toString() {
      return name + "=" + ftjo;
  }
  
} 