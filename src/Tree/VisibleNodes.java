package Tree;

import java.util.LinkedList;
import java.util.Queue;

// There is a binary tree with N nodes.
// You are viewing the tree from its left side and can see only the leftmost nodes at each level.
// Return the number of visible nodes.
// Note: You can see only the leftmost nodes, but that doesn't mean they have to be left nodes.
// The leftmost node at a level could be a right node.
// Example
//            8  <------ root
//           / \
//         3    10
//        / \     \
//       1   6     14
//          / \    /
//         4   7  13
// output = 4

public class VisibleNodes {
    int visibleNodes(TreeNode root) {
        if(root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0;
        while(!q.isEmpty()){
            level++;
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        return level;

    }
}
