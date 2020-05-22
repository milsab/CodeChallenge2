package HashMap;

// Given a string, sort it in decreasing order based on the frequency of characters.
//
//Example 1:
//
//Input:
//"tree"
//
//Output:
//"eert"

import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortByFrequency {
    public static void main(String[] args) {
        System.out.print(sort("tree"));
    }

    public static String sort(String s){
        if(s == null || s.length() == 0)
            return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        ArrayList<Character> freq = new ArrayList(map.keySet());
        Collections.sort(freq, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return map.get(a) - map.get(b);
            }
        });

        StringBuilder ans = new StringBuilder();
        for(char c : freq){
            int index = 0;
            while(index++ < map.get(c)) ans.insert(0, c);
        }

        return ans.toString();
    }
}
