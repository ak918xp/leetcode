package JianZhiOffer;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/29 11:40
 */
public class kthLargest {
    public static int kthLargest(TreeNode root, int k){
        List<Integer> res = new ArrayList<>();
        inOrder(root,res,k);
        return res.get(k-1);
    }

    public static void inOrder(TreeNode root,List<Integer> res,int k){
        if(root==null || res.size()==k){
            return;
        }
        inOrder(root.right,res,k);
        res.add(root.val);
        inOrder(root.left,res,k);
    }
}
