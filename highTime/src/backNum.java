/*
* 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
* 建一个栈 将元素依次压入栈中 输出比较
* */
import java.util.Stack;

public class backNum {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String strx=Integer.toString(x);
        Stack<Character> stack=new Stack();
        for(int i=0;i<strx.length();i++){
            stack.push(strx.charAt(i));
        }
        while(!stack.isEmpty()) {
            for(int i=0;i<strx.length();i++){
                if(stack.pop()!=strx.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
