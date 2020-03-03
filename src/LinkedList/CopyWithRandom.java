package LinkedList;

import java.util.HashMap;

public class CopyWithRandom {
    static class ListNode{
        int val;
        ListNode next;
        ListNode random;

        public ListNode(int x){
            val = x;
        }
    }
    static HashMap<ListNode, ListNode> map = new HashMap<>();
    public static ListNode copy(ListNode node){
        if(node == null)
            return null;
        if(map.containsKey(node))
            return map.get(node);
        ListNode newNode = new ListNode(node.val);
        map.put(node, newNode);

        newNode.next = copy(node.next);
        newNode.random = copy(node.random);

        return newNode;
    }

}
