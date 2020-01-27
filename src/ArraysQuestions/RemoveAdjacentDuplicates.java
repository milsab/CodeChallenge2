package ArraysQuestions;

import java.util.Stack;

// Given a string s, recursively remove adjacent duplicate characters from the string s.
// The output string should not have any adjacent duplicates.
// geeksforgeek => gksforgk
// acaaabbbacdddd => acac

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("acaaabbbacdddd"));
    }

    public static String removeDuplicates(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean remove = false;
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == stack.peek()){
                remove = true;
            }else{
                if(remove) {
                    stack.pop();
                    remove = false;
                }
                stack.push(s.charAt(i));
            }
        }
        if(remove) stack.pop();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
