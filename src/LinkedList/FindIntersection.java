package LinkedList;

public class FindIntersection {

    // Two Pointer Wise Approach
    /*
         A = 1 -> 3 -> 5 -> 7 -> 9 -> 11 -> null
         B = 2 -> 4 -> 9 -> 11 -> null

         AB = 1 -> 3 -> 5 -> 7 -> 9 -> 11 -> 2 -> 4 -> "9" -> 11 -> null
         BA = 2 -> 4 -> 9 -> 11 -> 1 -> 3 -> 5 -> 7 -> "9" -> 11 -> null
    */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while(nodeA != nodeB){
            if(nodeA == null)
                nodeA = headB;
            else
                nodeA = nodeA.next;

            if(nodeB == null)
                nodeB = headA;
            else
                nodeB = nodeB.next;
        }
        return nodeA;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
