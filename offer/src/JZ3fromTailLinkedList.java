/*
* 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
* 思路：要反向输出 用栈即可 栈先进后出 遍历链表存储在栈中 再输出 放入表中 不需要单独考虑空
* */
import java.util.ArrayList;
import java.util.Stack;
public class JZ3fromTailLinkedList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            Integer e = stack.pop();
            arrayList.add(e);
        }
        return arrayList;
    }
}
