import java.util.HashMap;
import java.util.Map;
public class buildTree {
    private Map<Integer,Integer> indexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        indexMap=new HashMap<>();
        for(int i=0;i<n;i++){
            indexMap.put(inorder[i],i);
        }
        return myBuildTree(preorder,inorder,0,n-1,0,n-1);
    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right){
        if (preorder_left > preorder_right) {
            return null;
        }
        TreeNode root=new TreeNode(preorder[preorder_left]);
        int rootIn=indexMap.get(preorder[preorder_left]);
        // 得到左子树中的节点数目
        int size_left_subtree = rootIn - inorder_left;
        root.left=myBuildTree(preorder,inorder,preorder_left+1,preorder_left + size_left_subtree,inorder_left,rootIn-1);
        root.right=myBuildTree(preorder,inorder,preorder_left+size_left_subtree+1,preorder_right,rootIn+1,inorder_right);
        return root;
    }
}
