package Tree;

// Example:
//
//Input:
//
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//Output:
//
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1


public class InvertBinaryTree {
    public TreeNode invert(TreeNode root){
        if(root == null)
            return null;
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
