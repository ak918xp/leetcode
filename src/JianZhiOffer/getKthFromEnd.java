package JianZhiOffer;

import common.ListNode;

public class getKthFromEnd {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = getKthFromEnd(head,2);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first=head,last = head;
        while(k>0){
            first=first.next;
            k--;
        }
        while(first!=null){
            first=first.next;
            last=last.next;
        }
        return last;
    }
}
