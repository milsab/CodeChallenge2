package LinkedList;

// Remove Kth node from End of a LinkedList
public class RemoveKthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        int i = 0;
        while(fast.next != null){
            fast = fast.next;
            if(i >= n){
                slow = slow.next;
            }
            i++;
        }
        if(i < n)
            head = head.next;
        else
            slow.next = slow.next.next;
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
}
