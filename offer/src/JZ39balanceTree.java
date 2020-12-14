/*
* 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
平衡二叉树性质：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，
* 并且左右两个子树都是一棵平衡二叉树。
* 思路：求出左右子树的高度，差小于等于1即可
* */
class TreeNode{
     int value;
     TreeNode left;
     TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}
public class JZ39balanceTree {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        int dif=left-right;
        if(Math.abs(dif)<=1){
            return true;
        }
        return false;
    }

    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}
