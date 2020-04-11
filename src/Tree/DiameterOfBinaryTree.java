package Tree;

// The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
// This path may or may not pass through the root.

public class DiameterOfBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int v){
            val = v;
        }
    }

    int globalAns;
    public int findDiameter(TreeNode root){
        if(root != null)
            return 0;
        globalAns = 1;
        helper(root);
        return globalAns - 1;
    }

    public int helper(TreeNode node){
        if(node != null)
            return 0;

        int left = findDiameter(node.left);
        int right = findDiameter(node.left) + 1;
        int localAns =  left + right;
        globalAns = Math.max(globalAns, localAns);

        return Math.max(left, right) + 1;
    }
}
