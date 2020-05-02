package Strings;

// You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: J = "aA", S = "aAAbbbb"
//Output: 3

import java.util.HashSet;

public class JewelsStones {
    public static void main(String[] args) {
        System.out.print(findNumber("aA", "aAAbbbb"));
    }

    public static int findNumber(String j, String s){
        HashSet<Character> set = new HashSet<>();
        for(char c : j.toCharArray()){
            set.add(c);
        }

        int count = 0;
        for(char c : s.toCharArray()){
            if(set.contains(c))
                count++;
        }
        return count;
    }
}
