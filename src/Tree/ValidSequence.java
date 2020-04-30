package Tree;

//Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary Tree
//Given a binary tree where each path going from the root to any leaf form a valid sequence,
//check if a given string is a valid sequence in such binary tree.
//We get the given string from the concatenation of an array of integers arr and the concatenation
//of all values of the nodes along a path results in a sequence in the given binary tree.
//
//Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,0,1]
//Output: true
//Explanation:
//The path 0 -> 1 -> 0 -> 1 is a valid sequence (green color in the figure).
//Other valid sequences are:
//0 -> 1 -> 1 -> 0
//0 -> 0 -> 0
//
//Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,0,1]
//Output: false
//Explanation: The path 0 -> 0 -> 1 does not exist, therefore it is not even a sequence.
public class ValidSequence {

    public boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root, arr, 0);
    }

    public boolean dfs(TreeNode node, int[] arr, int index){
        if(node == null)
            return false;

        if(index == arr.length - 1 && arr[index] == node.val)
            return isLeaf(node);

        if(node.val == arr[index]){
            return dfs(node.left, arr, index + 1) || dfs(node.right, arr, index + 1);
        } else
            return false;
    }

    public boolean isLeaf(TreeNode node){
        if(node == null)
            return false;
        if(node.left == null && node.right == null)
            return true;

        return false;
    }
}
