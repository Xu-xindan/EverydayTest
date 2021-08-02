import java.util.Stack;

public class JZ5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){//判断队列中原本是否有元素 有的话直接弹出 没有再放入
            while(!stack1.empty()){
                int n=stack1.pop();
                stack2.push(n);
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }
}
