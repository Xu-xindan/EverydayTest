import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class partitionNode {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead==null){
            return pHead;
        }
        if(pHead.next==null){
            return pHead;
        }
        ListNode shead=new ListNode(-1);
        ListNode scur=shead;
        ListNode bhead=new ListNode(-1);
        ListNode bcur=bhead;
        while(pHead!=null) {
            if(pHead.val<x){
                scur.next=new ListNode(pHead.val);
                scur=scur.next;
            }else{
                bcur.next=new ListNode(pHead.val);
                bcur=bcur.next;
            }
            pHead=pHead.next;
        }
        scur.next=bhead.next;
        return shead.next;
    }
}
