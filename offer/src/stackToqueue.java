import java.util.Stack;

public class stackToqueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public stackToqueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                int s = stack1.peek();
                stack1.pop();
                stack2.push(s);
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }
        return stack2.pop();
    }
}
