package JianZhiOffer;

import common.TreeNode;

public class mirrorTree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode res = mirrorTree(root);
        System.out.println(res);
    }

    public static TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode res = new TreeNode(root.val);
        dfs(root,res);
        return res;
    }

    public static void dfs(TreeNode root,TreeNode res){
        if(root!=null){
            if(root.right!=null){
                res.left = new TreeNode(root.right.val);
            }
            if(root.left!=null){
                res.right= new TreeNode(root.left.val);
            }
            dfs(root.left,res.right);
            dfs(root.right,res.left);
        }
    }
}
