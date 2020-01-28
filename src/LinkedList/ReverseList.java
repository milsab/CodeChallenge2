package LinkedList;
//Return reference of new head of the reverse linked list
public class ReverseList {
    Node reverseList(Node head)
    {
        if(head == null)
            return null;

        Node newHead = head;
        while(head.next != null){
            Node node = head.next;
            head.next = node.next;
            node.next = newHead;
            newHead = node;
        }
        return newHead;
    }


     class Node {
         int value;
         Node next;
         Node(int value) {
             this.value = value;
         }
     }
}
