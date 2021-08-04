package JianZhiOffer;

import common.ListNode;

/**
 * @author HaoYuan
 */
public class deleteNode {
    public static void main(String[] args){
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        head.next.next = new ListNode(-99);
        int val=-99;
        ListNode res = deleteNode(head,val);
    }

    public static ListNode deleteNode(ListNode head, int val) {
        ListNode cur = new ListNode();
        ListNode dummy = cur;
        cur.next=head;
        while(cur!=null && cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}
