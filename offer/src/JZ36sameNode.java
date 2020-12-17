import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
* 输入两个链表，找出它们的第一个公共结点。
* 解法1：分别求长度 长的先走插值个位置 再同时往下走 相同返回
* 解法2：同时往下走 遍历
* 解法3：栈 先都分别压入栈 一个一个往外出 不同的前一个结点即为所求
* 解法4：map 把一个链表每个节点存在map中 遍历第二个链表找到与它相同的结点
* */
public class JZ36sameNode {
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        int len1=countNode(pHead1);
        int len2=countNode(pHead2);
        if(len1!=len2) {
            if (len1 > len2) {
                for (int i = len1 - len2; i > 0; i--) {
                    pHead1 = pHead1.next;
                }
            } else {
                for (int i=len2-len1;i>0;i--){
                    pHead2=pHead2.next;
                }
            }
        }
        while(pHead1!=pHead2){
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return pHead1;
    }

    private int countNode(ListNode head) {
        int count=0;
        if(head==null){
            return 0;
        }
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }

    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2){
        if(pHead1==null||pHead2==null){
            return null;
        }
        ListNode p1=pHead1;
        ListNode p2=pHead2;
        while(p1!=p2){
            p1=p1==null?pHead2:p1.next;
            p2=p2==null?pHead1:p2.next;
        }
        return p1;
    }

    public ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2){
        if(pHead1==null||pHead2==null){
            return null;
        }
        ListNode p1=pHead1;
        ListNode p2=pHead2;
        Stack<ListNode> stack1=new Stack<>();
        Stack<ListNode> stack2=new Stack<>();
        while (p1!=null){
            stack1.push(p1);
            p1=p1.next;
        }
        while(p2!=null){
            stack2.push(p2);
            p2=p2.next;
        }
        ListNode res=null;
        if(stack1.peek()!=stack2.peek()){
            return res;
        }
        while(stack1.size()!=0&&stack2.size()!=0){
            res=stack1.peek();
            stack1.pop();
            stack2.pop();
            if(!stack1.isEmpty()&&!stack2.isEmpty()&&stack1.peek()!=stack2.peek()){
                return res;
            }
        }
        return res;
    }

    public ListNode FindFirstCommonNode4(ListNode pHead1, ListNode pHead2){
        Map<ListNode,Integer> map=new HashMap<>();
        while(pHead1!=null){
            map.put(pHead1,null);
            pHead1=pHead1.next;
        }
        while(pHead2!=null){
            if(map.containsKey(pHead2)){
                return pHead2;
            }
            pHead2=pHead2.next;
        }
        return null;
    }
}

