class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class balanceTree {
    public boolean isBalance(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1){
            return false;
        }
        return isBalance(root.left)&&isBalance(root.right);
    }

    private static int getHeight(TreeNode treeNode){
        if(treeNode.left==null&&treeNode.right==null){
            return 1;
        }
        return Math.max(getHeight(treeNode.left),getHeight(treeNode.right))+1;
    }
}
