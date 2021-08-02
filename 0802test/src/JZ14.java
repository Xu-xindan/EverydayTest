public class JZ14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode low=new ListNode(-1);
        low.next=pHead;
        ListNode high=low;
        while(k>0&&high.next!=null){
            high=high.next;
            k--;
        }
        if(k>0) return null;
        while(high.next!=null){
            high=high.next;
            low=low.next;
        }
        return low.next;
    }
}
