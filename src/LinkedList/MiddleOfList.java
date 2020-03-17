package LinkedList;

public class MiddleOfList {
    public static void main(String[] args) {

    }

    public static class Node{
        int val;
        Node next;
        public Node(int x){
            val = x;
        }
    }

    public static Node findMiddle(Node root){
        if(root == null)
            return root;

        Node slow = root;
        Node fast = root;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
