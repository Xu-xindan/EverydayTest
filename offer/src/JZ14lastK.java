import java.util.*;
/*
* 输入一个链表，输出该链表中倒数第k个结点。如果该链表长度小于k，请返回空。
* 思路：设置快慢两个点 快的先走k步 慢的再和快的同步走
* */
public class JZ14lastK {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if(pHead==null||k==0){
            return null;
        }
        ListNode low=pHead;
        ListNode quick=pHead;
        int count=k;
        while(quick.next!=null&&count>1){
            quick= quick.next;
            count--;
        }
        if(count>1){
            return null;
        }
        while(quick.next!=null){
            quick= quick.next;
            low=low.next;
        }
        return low;
    }
}
