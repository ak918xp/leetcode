package JianZhiOffer;

import common.ListNode;

public class reverseList {
    public static void main(String[] args){

    }

    public static ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        ListNode first = head;
        ListNode last = null;
        while(first!=null){
            dummy=first.next;

            first.next=last;
            last=first;
            first=dummy;
        }
        return last;
    }
}
