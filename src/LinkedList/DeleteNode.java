package LinkedList;

// delete a Node in Linked List without knowing the head
// In this case we can swap the values
public class DeleteNode {
    class Node{
        int val;
        Node next;
    }

    public void deleteNode(Node node){
        if(node == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
