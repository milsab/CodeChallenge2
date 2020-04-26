package Strings;


// You are given two strings s and t.
// You can select any substring of string s and rearrange the characters of the selected substring.
// Determine the minimum length of the substring of s such that string t is a substring of the selected substring.
// Or in other words:
// Find minimum window width in string x that contains all characters of another string y. For example:
// String x = "coobdafceeaxab"
// String y = "abc"
// The answer should be 5, because the shortest substring in x that contains all three letters of y is "bdafc".

import java.util.Collections;
import java.util.HashMap;

public class MinLenSubstrings {
    public static void main(String[] args) {
        System.out.print(findMinLen("bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf", "cbccfafebccdccebdd"));
    }

    public static int findMinLen(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : t.toCharArray()){
            map.put(c, -1);
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) ){
                map.put(s.charAt(i), i);
                if(Collections.min(map.values()) >= 0){
                    ans = Math.min(ans, Collections.max(map.values()) - Collections.min(map.values()) + 1);
                }
            }
        }
        return ans < Integer.MAX_VALUE ? ans :  -1;
    }
}
