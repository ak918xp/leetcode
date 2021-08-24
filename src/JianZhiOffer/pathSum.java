package JianZhiOffer;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/24 16:36
 */
public class pathSum {
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.left=new TreeNode(5);
        root.right.right.right=new TreeNode(1);
        List<List<Integer>> ans = pathSum(root,22);
    }

    static List<List<Integer>> res;
    public static List<List<Integer>> pathSum(TreeNode root, int target) {
        res = new ArrayList<>();
        if(root!=null){
            dfs(root,target,new ArrayList<>());
        }
        return res;
    }

    public static void dfs(TreeNode root,int target,List<Integer> path){
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(target-root.val==0){
                res.add(new ArrayList<>(path));
            }
        }
        else{
            if(root.left!=null){
                dfs(root.left,target-root.val,path);
                path.remove(path.size()-1);
            }
            if(root.right!=null){
                dfs(root.right,target-root.val,path);
                path.remove(path.size()-1);
            }
        }
    }
}
