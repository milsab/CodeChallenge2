package Tree;

// root is Height 1
public class BinaryTreeHeight {

    int maxHeight = 0;
    public int findHeight(TreeNode root){
        dfs(root, 0);
        return maxHeight;
    }

    public void dfs(TreeNode node, int height){
        if(node == null){
            maxHeight = Math.max(maxHeight, height);
            return;
        }

        height++;
        dfs(node.left, height);
        dfs(node.right, height);
    }
}
