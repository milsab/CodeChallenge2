package Tree;
// Convert a Binary Search Tree to a sorted Circular Doubly-Linked List in place.

public class BSTtoDoublyLinkedList {

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    Node first;
    Node last;

    public Node convert(Node root){
        if(root == null)
            return null;

        helper(root);
        first.left = last;
        last.right = first;

        return first;
    }

    public void helper(Node node){
        if(node == null)
            return;

        // InOrder Traversal

        // Left Child
        helper(node.left);

        // Current Node
        if(last != null){
            last.right = node;
            node.left = last;
        } else{
            first = node;
        }
        last = node;

        // Right Node
        helper(node.right);
    }
}
