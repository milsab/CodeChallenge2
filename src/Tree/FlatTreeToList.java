package Tree;

import LinkedList.ListNode;

// Flatten a binary tree to a linked list in place
public class FlatTreeToList {

    TreeNode prv;
    public void getFlat(TreeNode root){
        if(root == null)
            return;

        getFlat(root.right);
        getFlat(root.left);

        root.right = prv;
        root.left = null;

        prv = root;

    }
}
