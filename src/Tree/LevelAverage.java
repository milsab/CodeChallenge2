package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Suppose we have a binary tree which has Integer as its values. Find average value in each level
public class LevelAverage {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int v){
            val = v;
        }
    }

    public List<Double> findAvg(TreeNode root){
        if(root == null)
            return null;
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            Double sum = 0.0;
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                sum += node.val;

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            ans.add(sum / size);

        }
        return ans;
    }
}
