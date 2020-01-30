package LinkedList;


// Find if a Linked List is Palindrome or not

import java.util.Stack;

public class Palindrome {

    class ListNode {
        int val;
        ListNode next;
    }

    public static boolean isPalindrome(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while(node != null){
            stack.push(node.val);
            node = node.next;
        }

        ListNode node2 = head;
        while(node2 != null){
            if(node2.val != stack.pop())
                return false;
            node2 = node2.next;
        }
        return true;
    }
}
