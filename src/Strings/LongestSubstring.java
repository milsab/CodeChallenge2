package Strings;

import java.util.HashSet;

// Given a string S, find length of the longest substring with all distinct characters.
// For example, for input "abca", the output is 3 as "abc" is the longest substring with
// all distinct characters.

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(find("geeksforgeeks"));
    }

    public static int find(String str){
        int f = 0;
        int s = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        while(s < str.length()){
            if(set.contains(str.charAt(s))){
                set.remove(str.charAt(f));
                f++;
            } else{
                set.add(str.charAt(s));
                s++;
                max = Math.max(max, s - f);
            }
        }
        return max;
    }
}
