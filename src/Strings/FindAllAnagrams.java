package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        System.out.print(findAnagrams("cbaebabacd", "abc"));
    }

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
        String[] c1 = a.split("");
        String[] c2 = b.split("");
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s1 = String.join("", c1);
        String s2 = String.join("", c2);
        return s1.equals(s2);
    }
}
