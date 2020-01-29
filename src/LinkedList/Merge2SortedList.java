package LinkedList;

public class Merge2SortedList {
    Node sortedMerge(Node headA, Node headB) {
        if(headA == null) return headB;
        if(headB == null) return headA;

        if(headA.data <= headB.data){
            headA.next = sortedMerge(headA.next, headB);
            return headA;
        } else {
            headB.next = sortedMerge(headA, headB.next);
            return headB;
        }
    }

    class Node{
        int data;
        Node next;
    }
}
