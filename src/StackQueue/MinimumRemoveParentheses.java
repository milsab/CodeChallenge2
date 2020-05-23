package StackQueue;

// Given a string s of '(' , ')' and lowercase English characters.
//
// Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions )
// so that the resulting parentheses string is valid and return any valid string.

import java.util.HashSet;
import java.util.Stack;

public class MinimumRemoveParentheses {
    public static void main(String[] args) {
        System.out.println(remove("a)b(c)d"));
    }

    public static String remove(String  s){
        HashSet<Integer> set = new HashSet<>(); // set to add indexes for invalid parenthesis
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stk.push(i);
            } else if(c == ')'){
                if(stk.isEmpty())
                    set.add(i);
                else
                    stk.pop();
            }
        }

        while(!stk.isEmpty())
            set.add(stk.pop());

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(i))
                ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}
