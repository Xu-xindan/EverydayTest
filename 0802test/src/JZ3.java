import java.util.ArrayList;
import java.util.Stack;

class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}
public class JZ3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack= new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(!stack.empty()){
            int s=stack.pop();
            arrayList.add(s);
        }
        return arrayList;
    }
}