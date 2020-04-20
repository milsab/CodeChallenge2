package Tree;

// Construct Binary Search Tree from Preorder Traversal
// Return the root node of a binary search tree that matches the given preorder traversal.

public class MakeBST {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0)
            return null;
        TreeNode ans = new TreeNode(preorder[0]);
        for(int i = 0; i < preorder.length; i++){
            insertNode(ans, preorder[i]);
        }
        return ans;
    }

    public void insertNode(TreeNode node, int x){

        if(x < node.val){
            if(node.left == null)
                node.left = new TreeNode(x);
            else
                insertNode(node.left, x);
        } else {
            if(node.right == null)
                node.right = new TreeNode(x);
            else
                insertNode(node.right, x);
        }
    }
}
