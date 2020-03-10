package Backtracking;

// Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
// Input: s1 = "ab" s2 = "eidbaooo"
// Output: True
// Explanation: s2 contains one permutation of s1 ("ba").

import java.util.ArrayList;
import java.util.List;

public class Permutation2String {
    public static void main(String[] args) {
        System.out.println(checkInclusion("abcmxfgkde", "abcdefxkmg"));
    }

    static List<String> perm = new ArrayList<>();
    public static boolean checkInclusion(String s1, String s2){
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
