package JianZhiOffer;
import common.TreeNode;

import java.util.HashMap;
import java.util.Map;


public class buildTree {
    private Map<Integer, Integer> indexMap;
    public TreeNode dfs(int[] preorder,int[] inorder,int preorder_left,int preorder_right,int inorder_left,int inorder_right){
        if(preorder_left>preorder_right){
            return null;
        }
        int preorder_root=preorder_left;
        int inorder_root=indexMap.get(preorder[preorder_root]);
        TreeNode root=new TreeNode(preorder[preorder_root]);
        int size_left_subtree=inorder_root-inorder_left;
        root.left=dfs(preorder,inorder,preorder_left+1,preorder_left+size_left_subtree,inorder_left,inorder_root-1);
        root.right=dfs(preorder,inorder,preorder_left+size_left_subtree+1,preorder_right,inorder_root+1,inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder,int[] inorder){
        int n = preorder.length;
        indexMap = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            indexMap.put(inorder[i],i);
        }
        return dfs(preorder, inorder, 0, n - 1, 0, n - 1);
    }
}