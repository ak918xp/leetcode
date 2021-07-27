package JianZhiOffer;

import common.TreeNode;
public class isSymmetric {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left=null;
        root.left.right=new TreeNode(3);
        root.right.left=new TreeNode(3);
        root.right.right=null;
        boolean flag = isSymmetric(root);
        System.out.println(flag);
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        else{
            return dfs(root.left,root.right);
        }
    }

    public static boolean dfs(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        else if((left==null&&right!=null)||(left!=null&&right==null)||(left.val!=right.val)){
            return false;
        }
        else if(left.val==right.val){
            return dfs(left.left,right.right)&&dfs(left.right,right.left);
        }
        return false;
    }
}
