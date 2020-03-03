package StackQueue;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{}[{})]"));
    }

    public static boolean isValid(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(stk.isEmpty() || map.get(c) != stk.pop())
                    return false;
            } else{
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}
