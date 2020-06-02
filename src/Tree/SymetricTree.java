package Tree;

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//
//
//But the following [1,2,2,null,3,null,3] is not:
//
//    1
//   / \
//  2   2
//   \   \
//   3    3

public class SymetricTree {
    public boolean idSymetric(TreeNode root){
        if(root == null)
            return true;

        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        return left.val == right.val &&
                isMirror(left.left, right.right) &&
                isMirror(left.right, right.left);
    }
}
