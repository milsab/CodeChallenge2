package Tree;

// Given the root node of a binary search tree,
// return the sum of values of all nodes with value between L and R (inclusive).
//
// The binary search tree is guaranteed to have unique values.
// Example 1:
//
// Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
// Output: 32

public class RangeSumBST {
    public static void main(String[] args) {
        RangeSumBST rs = new RangeSumBST();
        System.out.print(rs.rangeSumBST(new TreeNode(4), 7 , 15));
    }

    int sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
        sum = 0;
        dfs(root, L, R);
        return sum;
    }

    public void dfs(TreeNode node, int l, int r){
        if(node == null)
            return;
        if(node.val >= l && node.val <= r){
            sum += node.val;
        }
        if(node.val > l){
            dfs(node.left, l, r);
        }
        if(node.val < r){
            dfs(node.right, l, r);
        }
    }
}
