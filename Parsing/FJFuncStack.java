import java.util.ArrayList;

public class FJFuncStack {

    ArrayList<FJFunction> stack = new ArrayList<>();

    void push(FJFunction func) {
        stack.add(func);
    }

    FJFunction pop() {
        return stack.remove(stack.size() - 1);
    }


    public FJFunction top() {
        return stack.get(stack.size() - 1);
    }


}
