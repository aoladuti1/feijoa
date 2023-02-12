import java.util.ArrayList;

public class FJLStack {

    ArrayList<FJList> stack = new ArrayList<>();
    
    FJTO emptyList() {
        return FJ.newList();
    }

    void push() {
        stack.add(new FJList());
    }

    FJList top() {
        return stack.get(stack.size() - 1);
    }

    FJList pop() {
        return stack.remove(stack.size() - 1);
    }

    void processArg(FJTO o) {
        top().add(o);
    }

    void processLastArg(FJTO o) {
        processArg(o);
    }

}
