/***
 * Stack for assignment resolution of a list ( which [sub]list to assign to? )
 */
public class FJARStack {
    
    FJTO top;
    FJTO index;

    void push(FJTO o) {
        top = o;
    }

    void nextList(FJTO index) {
        top = FJ.subscript(top, index);
    }

    /**
     * Pops and returns pop
     **/
    FJTO pop() {
        return top;
    }

}
