package LinkedList;

public class AddTwoNumber {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode addNumbers(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        int carry = 0;
        ListNode ans = new ListNode(-1);
        ListNode cur = ans;
        while(l1.next != null && l2.next != null){
            int value = l1.val + l2.val + carry;
            carry = value > 9 ? 1 : 0;
            value = carry == 1 ? value % 10 : value;
            ListNode node = new ListNode(value);
            cur.next = node;
            cur = cur.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1.next != null){
            int value = l1.val + carry;
            carry = value > 9 ? 1 : 0;
            value = carry == 1 ? value % 10 : value;
            ListNode node = new ListNode(value);
            cur.next = node;
            cur = cur.next;
            l1 = l1.next;
        }

        while(l2.next != null){
            int value = l2.val + carry;
            carry = value > 9 ? 1 : 0;
            value = carry == 1 ? value % 10 : value;
            ListNode node = new ListNode(value);
            cur.next = node;
            cur = cur.next;
            l2 = l2.next;
        }

        if(carry == 1){
            cur.next = new ListNode(1);
        }
        return ans.next;
    }
}
