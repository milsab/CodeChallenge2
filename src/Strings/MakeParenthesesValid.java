package Strings;

// Question:
// Given a string S of '(' and ')' parentheses,
// we add the minimum number of parentheses ( '(' or ')', and in any positions )
// so that the resulting parentheses string is valid.

// Intuition:
// To make a string valid,
// we can add some ( on the left,
// and add some ) on the right.
// We need to find the number of each.
//
// Explanation:
// left records the number of ( we need to add on the left of S.
// right records the number of ) we need to add on the right of S,
// which equals to the number of current opened parentheses.
//
// Loop char c in the string S:
// if (c == '('), we increment right,
// if (c == ')'), we decrement right.
// When right is already 0, we increment left
// Return left + right in the end
public class MakeParenthesesValid {
    public static void main(String[] args) {
        System.out.println(makeValid("()))(()"));
    }

    public static int makeValid(String s){
        int left = 0;
        int right = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                right++;
            else if(right > 0)
                right--;
            else
                left++;
        }
        return left + right;
    }
}
