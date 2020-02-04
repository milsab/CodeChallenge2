package Tree;

// Check to see whether a binary tree is binary search tree or not
public class CheckBST {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }

    public boolean isBST(TreeNode root){
        Integer min = null;
        Integer max = null;

        return helper(root, min, max);
    }

    public boolean helper(TreeNode node, Integer min, Integer max){
        if(node == null)
            return true;

        if(min != null && node.val < min)
            return false;
        if(max != null && node.val > max)
            return false;

        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }
}
