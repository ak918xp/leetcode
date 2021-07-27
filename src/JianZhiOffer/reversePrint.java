package JianZhiOffer;

import common.ListNode;

public class reversePrint {
    public static void main(String[] args){

    }

    public static int[] reversePrint(ListNode head) {
        int[] store = new int[10000];
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            store[count++]=cur.val;
            cur=cur.next;
        }
        int[] res=new int[count];
        for(int i=count-1;i>=0;i--){
            res[count-1-i]=store[i];
        }
        return res;
    }
}
