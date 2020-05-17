package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        System.out.print(findAnagrams("cbaebabacd", "abc"));
    }

    // Brute Force Approach
    static public List<Integer> findAnagrams(String s, String p) {
        int len = p.length();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= s.length() - len; i++){
            String temp = s.substring(i, i + len);
            if(isAnagram(temp, p)){
                ans.add(i);
            }
        }
        return ans;
    }

    static public boolean isAnagram(String a, String b){
        char[] map = new char[26];

        for(char c : a.toCharArray()){
            map[c - 'a'] += 1;
        }

        for(char c : b.toCharArray()){
            if(map[c -'a'] == 0)
                return false;
            map[c - 'a'] -= 1;
        }

        for(int i = 0; i < 26; i++){
            if(map[i] < 0)
                return false;
        }

        return true;
    }
}
