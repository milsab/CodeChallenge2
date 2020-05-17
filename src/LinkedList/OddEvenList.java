package LinkedList;

public class OddEvenList {
    public ListNode generateOddEvenList(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while(odd != null && even != null){
            odd.next = even.next;
            odd = even.next;

            even.next = odd.next;
            even = odd.next;

        }

        odd.next = evenHead;

        return head;
    }
}
