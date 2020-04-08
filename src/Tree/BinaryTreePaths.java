package Tree;

//  return all root-to-leaf paths.

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x){
            val = x;
        }
    }

    List<String> ans = new ArrayList<>();
    public List<String> findAllPaths(TreeNode root){
        ans = new ArrayList<>();
        if(root == null)
            return ans;
        dfs(root, new ArrayList<>());
        return ans;
    }

    public void dfs(TreeNode node, List<String> currentPath){
        if(node == null)
            return;
        currentPath.add(String.valueOf(node.val));
        if(node.left == null && node.right == null){
            ans.add(String.join("->", currentPath));
            return;
        }

        dfs(node.left, new ArrayList<>(currentPath));
        dfs(node.right, new ArrayList<>(currentPath));
    }
}
