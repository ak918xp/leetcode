package JianZhiOffer;

import common.ListNode;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/19 11:49
 */
public class getIntersectionNode {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int countA=0;
        int countB=0;
        while(nodeA!=null){
            nodeA=nodeA.next;
            countA++;
        }
        while(nodeB!=null){
            nodeB=nodeB.next;
            countB++;
        }
        int longer=countA-countB;
        nodeA=headA;
        nodeB=headB;
        while(longer>0 ){
            nodeA=nodeA.next;
            longer--;
        }
        while(longer<0){
            nodeB=nodeB.next;
            longer++;
        }
        while(nodeA!=nodeB){
            nodeA=nodeA.next;
            nodeB=nodeB.next;
        }
        return nodeA;

    }
}
