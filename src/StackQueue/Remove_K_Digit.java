package StackQueue;

//Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
//
//Note:
//The length of num is less than 10002 and will be ≥ k.
//The given num does not contain any leading zero.
//Example 1:
//
//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

import java.util.Stack;

public class Remove_K_Digit {
    public static void main(String[] args) {
        System.out.print(remove("1432219", 3));
    }

    public static String remove(String num, int k){
        int len = num.length();
        // corner case
        if(len == k)
            return "0";

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < len; i++){
            //whenever meet a digit which is less than the previous digit, discard the previous one
            if(k > 0 && !stack.isEmpty() && num.charAt(i) < stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }

        // corner case like "1111"
        while(k>0){
            stack.pop();
            k--;
        }


        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }

        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);

        return sb.toString();
    }
}
