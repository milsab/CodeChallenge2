package LinkedList;

public class SwapNodes {
    class Node{
        int data;
        Node next;
    }

    public Node swapNodes(Node head){

        if(head == null || head.next == null)
            return null;
        Node newHead = head.next;
        Node temp = newHead.next;
        newHead.next = head;
        head.next = swapNodes(temp);
        return newHead;
    }
}
