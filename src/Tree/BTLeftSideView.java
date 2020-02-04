package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLeftSideView {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
    public List<Integer> leftView(TreeNode root){
        if(root == null)
            return null;
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.remove();
                if(i == 0){
                    ans.add(node.val);
                }
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        return ans;
    }
}
