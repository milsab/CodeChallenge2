package Tree;

//Find the maximum path sum.
//
// path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
// The path does not need to go through the root.
//
//Input: [-10,9,20,null,null,15,7]
//
//   -10
//   / \
//  9  20
//    /  \
//   15   7
//
//Output: 42
public class MaxSum {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            val = x;
        }
    }

    int maxSum = Integer.MIN_VALUE;
    public int findSum(TreeNode root){
        if(root == null)
            return 0;

        int left = Math.max(findSum(root.left), 0);
        int right = Math.max(findSum(root.right), 0);

        int sum = left + right + root.val;
        maxSum = Math.max(maxSum, sum);

        return Math.max(left, right) + root.val;
    }
}
