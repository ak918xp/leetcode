package JianZhiOffer;

import common.TreeNode;

public class isSubStructure {
    public static void main(String[] args){
        TreeNode A = new TreeNode(10);
        A.left=new TreeNode(12);
        A.right=new TreeNode(6);
        A.left.left=new TreeNode(8);
        A.left.right=new TreeNode(3);
        A.right.left=new TreeNode(11);
//        A.right.right=new TreeNode(7);
//        A.left.left.left=new TreeNode(8);
//        A.left.left.right=new TreeNode(9);

        TreeNode B=new TreeNode(10);
        B.left=new TreeNode(12);
        B.right=new TreeNode(6);
        B.left.left=new TreeNode(8);
        System.out.println(isSubStructure(A,B));
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null){
            return false;
        }
        else if(A.val==B.val && dfs(A,B)){
            return true;
        }
        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public static boolean dfs(TreeNode A,TreeNode B){
        if(B==null){
            return true;
        }
        else if(A != null && A.val == B.val){
            return dfs(A.left,B.left) && dfs(A.right,B.right);
        }
        else {
            return false;
        }
    }
}
