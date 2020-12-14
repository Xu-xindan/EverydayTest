/*
* 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
* 思路：定义一个头结点，两个链表从头开始谁小出谁，最后有剩余的直接加到最后
* */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class JZ16mergeLinkedList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list2 == null) {
            return list1;
        } else if (list2 != null && list1 == null) {
            return list2;
        }else{
            ListNode newHead = new ListNode(-1);
            ListNode cur = newHead;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    cur.next = list1;
                    cur=cur.next;
                    list1 = list1.next;
                } else {
                    cur.next = list2;
                    cur=cur.next;
                    list2 = list2.next;
                }
            }
            if (list1.next != null) {
                cur.next = list1;
            } else {
                cur.next = list2;
            }
            return newHead.next;
        }
    }
}
