package Hot100;

import common.ListNode;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/16 10:50
 */
public class addTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        int add=0;
        while(l1!=null || l2!=null || add!=0){
            int val1 = (l1!=null)? l1.val : 0;
            int val2 = (l2!=null)? l2.val : 0;
            int val = val1+val2+add;
            add=0;
            if(val>=10){
                val-=10;
                add++;
            }
            res.next = new ListNode(val);
            res=res.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return dummy.next;
    }
}
