package JianZhiOffer;
import common.TreeNode;
/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/24 17:12
 */
public class treeToDoublyList {
    public static void main(String[] args){

    }

    public TreeNode treeToDoublyList(TreeNode root) {

        if(root == null) {
            return null;
        }

        // 连接 root 与左侧和右侧已经排好序的链表
        inOrder(root);

        // 找已经排好序链表的最小节点
        while(root.left != null) {
            root = root.left;
        }

        TreeNode res = root;

        // 找已经排好序链表的最大节点
        while(root.right != null) {
            root = root.right;
        }

        // 连接最小最大节点
        res.left = root;
        root.right = res;

        return res;
    }

    // inorder 将 root 与 root 左子树最大的节点和 root 右子数最小的节点连接起来
    public void inOrder(TreeNode root){
        if(root == null) {
            return;
        }
        if(root.left != null){
            inOrder(root.left);
            TreeNode leftNode = root.left;
            while(leftNode.right != null) {
                leftNode = leftNode.right;
            }
            root.left = leftNode;
            leftNode.right  = root;
        }

        if(root.right != null){
            inOrder(root.right);
            TreeNode rightNode = root.right;
            while(rightNode.left != null) {
                rightNode = rightNode.left;
            }
            root.right = rightNode;
            rightNode.left = root;
        }
    }
}
