import java.util.*;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ListNodeAdd {
    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (a != null && b != null) {
            cur.next = new ListNode(a.val + b.val);;
            cur = cur.next;
            a = a.next;
            b = b.next;
        }
        if (a != null) {
            while (a != null) {
                cur.next = new ListNode(a.val);
                a = a.next;
            }
        }
        if (b != null) {
            while (b != null) {
                cur.next = new ListNode(b.val);
                b = b.next;
            }
        }
        cur = head;
        while (cur != null) {
            if (cur.val > 9) {
                cur.val = cur.val % 10;
                cur.next.val = cur.next.val + 1;
            }
            cur = cur.next;
        }
        return head.next;
    }
}
