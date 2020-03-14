package HashMap;

import java.util.*;

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(find("MMixllladSoxi"));
    }

    public static int find(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

//        for(char c : map.keySet()){
//            if(map.get(c) == 1){
//                return s.indexOf(c);
//            }
//        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
