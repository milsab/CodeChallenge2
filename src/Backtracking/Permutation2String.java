package Backtracking;

// Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
// Input: s1 = "ab" s2 = "eidbaooo"
// Output: True
// Explanation: s2 contains one permutation of s1 ("ba").

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutation2String {
    public static void main(String[] args) {
        System.out.println(checkInclusion("abcmxfgkde", "abcdefxkmg"));
    }

    // Array Approach
    public static boolean checkInclusion(String s1, String s2) {
        char[] map = new char[26];
        for(char c : s1.toCharArray()){
            map[c - 'a']++;
        }

        int len = s1.length();

        for(int i = 0; i <= s2.length() - s1.length(); i++){
            char[] tempMap = new char[26];
            for(int j = 0; j < len; j++){
                char c = s2.charAt(j + i);
                tempMap[c -'a']++;
            }
            if(matches(map, tempMap))
                return true;
        }

        return false;
    }

    public static boolean matches(char[] s1map, char[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }

    // HashMap Approach
    public static boolean checkInclusion_2(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int len = s1.length();

        for(int i = 0; i < s2.length(); i++){
            if(map.containsKey(s2.charAt(i))){
                HashMap<Character, Integer> tempMap = new HashMap<>();
                for(int j = i; j < s2.length() && j < i + len; j++){
                    char c = s2.charAt(j);
                    tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
                }
                if(map.equals(tempMap))
                    return true;
            }
        }

        return false;
    }


    static List<String> perm = new ArrayList<>();
    public static boolean checkInclusion_1(String s1, String s2){
        BT(s1, new ArrayList<>());
//        System.out.println(perm.size());
        for(String s : perm){
//            System.out.println(s+ " : s");
            if(s2.indexOf(s) > -1)
                return true;
        }
        return false;
    }

    public static void BT(String s, List<Character> cur){
        if(s.length() == cur.size()){
            StringBuilder sb = new StringBuilder();
            for(char c : cur)
                sb.append(c);
            perm.add(sb.toString());
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(cur.contains(s.charAt(i)))
                continue;
            // choose
            cur.add(s.charAt(i));
            // explore
            BT(s, cur);
            // un-choose
            cur.remove(cur.size() - 1);
        }
    }
}
