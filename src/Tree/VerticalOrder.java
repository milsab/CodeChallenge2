package Tree;

//Given a binary tree, return the vertical order traversal of its nodes' values. (ie, from top to bottom, column by column).
//
//If two nodes are in the same row and column, the order should be from left to right.
//
//Examples 1:
//
//Input: [3,9,20,null,null,15,7]
//
//   3
//  /\
// /  \
// 9  20
//    /\
//   /  \
//  15   7
//
//Output:
//
//[
//  [9],
//  [3,15],
//  [20],
//  [7]
//]
import javafx.util.Pair;

import java.util.*;

public class VerticalOrder {

    public List<List<Integer>> getVerticalOrer(TreeNode root){
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            TreeNode node = q.peek().getKey();
            int col = q.peek().getValue();
            if(!map.containsKey(col)){
                map.put(col, new ArrayList<>());
            }
            map.get(col).add(node.val);

            q.poll();
            if(node.left != null) q.add(new Pair<>(node.left, col - 1));
            if(node.right != null) q.add(new Pair<>(node.right, col + 1));
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int key : map.keySet()){
            ans.add(map.get(key));
        }

        return ans;
    }
}
