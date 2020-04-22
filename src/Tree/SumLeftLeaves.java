package Tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class SumLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        HashSet<TreeNode> set = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = 0;

        while(!q.isEmpty()){

            TreeNode node = q.remove();
            if(set.contains(node) && node.left == null && node.right == null){
                sum += node.val;
                continue;
            }

            if(node.left != null) {
                q.add(node.left);
                set.add(node.left);
            }
            if(node.right != null) q.add(node.right);

        }
        return sum;
    }
}
