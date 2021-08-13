package JianZhiOffer;

import common.TreeNode;

import java.util.*;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/13 8:51
 */
public class levelOrder {
    public static int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[]{};
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.size()>0){
            int size = queue.size();
            while(size>0){
                TreeNode now = queue.poll();
                res.add(now.val);
                if(now.left!=null){
                    queue.offer(now.left);
                }
                if(now.right!=null){
                    queue.offer(now.right);
                }
                size--;
            }
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}
