package Tree;


// Return the root node of a binary search tree that matches the given preorder traversal.

public class BSTfromPreOrder {
    public TreeNode constructBST(int[] preorder){
        if(preorder == null || preorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
            insertNode(root, preorder[i]);
        }

        return root;
    }

    public void insertNode(TreeNode node, int val){
        if(node == null) return;

        if(val < node.val){
            if(node.left == null){
                node.left = new TreeNode(val);
            } else{
                insertNode(node.left, val);
            }
        } else{
            if(node.right == null){
                node.right = new TreeNode(val);
            } else{
                insertNode(node.right, val);
            }
        }
    }
}
