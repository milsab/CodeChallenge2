package LinkedList;

// Remove Duplicates fromsorted LinkedList
public class RemoveDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head.next;
        ListNode prv = head;

        while(cur != null){
            if(cur.val != prv.val){
                prv.next = cur;
                prv = cur;
            }
            cur = cur.next;
        }
        prv.next = cur;
        return head;
    }
}
