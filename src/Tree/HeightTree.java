package Tree;
//The height of a binary tree is the number of edges between the tree's root and its furthest leaf.
public class HeightTree {
    static int globalHeight = 0;
    public static int height(TreeNode root) {

        dfs(root, 0);
        return globalHeight - 1;
    }

    public static void dfs(TreeNode node, int height){
        if(node == null){
            globalHeight = Math.max(globalHeight, height);
            return;
        }
        dfs(node.left, height + 1);
        dfs(node.right, height + 1);
    }
}
