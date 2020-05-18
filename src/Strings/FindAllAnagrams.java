package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        System.out.print(findAnagrams("cbaebabacd", "abc"));
    }

    public static  List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;

        int[] hash = new int[256];

        for (char c : p.toCharArray()) {
            hash[c]++;
        }

        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++)]-- >= 1) count--;

            if (count == 0) list.add(left);

            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;
    }

    // Brute Force Approach
    static public List<Integer> findAnagrams_1(String s, String p) {
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
