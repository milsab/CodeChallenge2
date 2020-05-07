package Tree;


// In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
//
//Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
//
//We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
//
//Return true if and only if the nodes corresponding to the values x and y are cousins.

public class CousinsBinaryTree {

    int xDepth, yDepth;
    TreeNode xParent, yParent;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, x, y, 0, null);

        return xDepth == yDepth && xParent != yParent ? true : false;
    }

    public void dfs(TreeNode node, int x, int y, int depth, TreeNode parent){
        if(node == null)
            return;

        if(node.val == x){
            xDepth = depth;
            xParent = parent;
        } else if(node.val == y){
            yDepth = depth;
            yParent = parent;
        }

        dfs(node.left, x, y, depth + 1, node);
        dfs(node.right, x, y, depth + 1, node);
    }
}
