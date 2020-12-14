/*
* 给定一棵二叉搜索树，请找出其中的第k小的结点。
* 思路：中序遍历 结点保存在表中 取出第k-1个结点
*      二叉搜索树的中序遍历有序
* */
import java.util.ArrayList;
public class JZ62kthNode {
    ArrayList<TreeNode> treenode =new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k){
        Inorder(pRoot);
        if(pRoot==null||k<1||k>treenode.size()){
            return null;
        }
        return treenode.get(k-1);
    }

    public void Inorder(TreeNode root){
        if(root!=null){
            Inorder(root.left);
            treenode.add(root);
            Inorder(root.right);
        }
    }
}
