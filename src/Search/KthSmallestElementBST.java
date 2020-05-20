package Search;

// Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

import Tree.TreeNode;

public class KthSmallestElementBST {
    int ans = 0;
    int count = 0;
    int k;
    public int findKthElement(TreeNode root, int k){
        this.k = k;
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode node){
        if(node == null)
            return;
        inorder(node.left);
        count++;
        if(count == k) {
            ans = node.val;
            return;
        }
        inorder(node.right);
    }
}
