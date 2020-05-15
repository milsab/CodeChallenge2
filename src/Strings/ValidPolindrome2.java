package Strings;


//Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
//
//Example 1:
//Input: "aba"
//Output: True
//Example 2:
//Input: "abca"
//Output: True
//Explanation: You could delete the character 'c'.


//Check from left and right at the same time until the first different pair.
//Now we have something like a****b, where a and b are different.
//We need to delete either a or b to make it a palindrome.

public class ValidPolindrome2 {
    public static void main(String[] args) {
        System.out.print(isValid("abca"));
    }

    public static boolean isValid(String s){

        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                int i1 = i, j1 = j - 1, i2 = i + 1, j2 = j;

                while(i1 < j1 && s.charAt(i1) == s.charAt(j1)){
                    i1++;
                    j1--;
                }

                while(i2 < j2 && s.charAt(i2) == s.charAt(j2)){
                    i++;
                    j--;
                }

                return i1 >= j1 || i2 >= j2;
            }
        }
        return true;
    }
}
