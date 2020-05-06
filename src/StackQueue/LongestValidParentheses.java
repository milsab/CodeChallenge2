package StackQueue;

import java.util.Stack;

//Given a string containing just the characters '(' and ')',
// find the length of the longest valid (well-formed) parentheses substring.
//
//Example 1:
//
//Input: "(()"
//Output: 2
//Explanation: The longest valid parentheses substring is "()"
//Example 2:
//
//Input: ")()())"
//Output: 4
//Explanation: The longest valid parentheses substring is "()()"

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.print(find(")()())"));
    }

    public static int find(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            } else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                } else{
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}
