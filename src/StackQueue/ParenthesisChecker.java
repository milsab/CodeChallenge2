package StackQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        System.out.println(isValid("{({})([])}"));
    }

    public static boolean isValid(String s){
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.pop())
                    return false;
            } else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
