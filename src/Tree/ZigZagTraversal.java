package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        for(List l : traverse(new TreeNode(3))){
            for(Object i : l){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> traverse(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean left_to_right = true;

        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < q.size(); i++){
                TreeNode node = q.poll();

                if(left_to_right){
                    list.add(node.val);
                } else{
                    list.add(0, node.val);
                }
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            left_to_right = !left_to_right;
            ans.add(list);
        }
        return ans;
    }
}
