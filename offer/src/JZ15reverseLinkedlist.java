/*
* 输入一个链表，反转链表后，输出新链表的表头
* 思路：遍历链表 选取当前节点和它前一个结点反转 当当前节点下一个节点为空时 记该节点为newHead
* */
public class JZ15reverseLinkedlist {
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=null;
        ListNode cur=head;
        ListNode newHead=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=curNext;
        }
        return newHead;
    }
}
