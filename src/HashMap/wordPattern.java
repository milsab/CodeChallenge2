package HashMap;

import LinkedList.LinkedList_Queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class wordPattern {
    public static void main(String[] args) {
        System.out.println(isMatch("abgba","water fire fg fire water"));
    }

    public static boolean isMatch(String pattern, String s){
        LinkedHashMap<Character, List<Integer>> pattern_map = new LinkedHashMap<>();
        LinkedHashMap<String, List<Integer>> str_map = new LinkedHashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if(!pattern_map.containsKey(c)){
                pattern_map.put(c, new ArrayList<>());
            }
            pattern_map.get(c).add(i);
        }

        String[] s_arr = s.split(" ");
        for(int i = 0; i < s_arr.length; i++){
            String str = s_arr[i];
            if(!str_map.containsKey(str)){
                str_map.put(str, new ArrayList<>());
            }
            str_map.get(str).add(i);
        }

        if(pattern_map.size() != str_map.size())
            return false;

        for(int i = 0; i < pattern_map.size(); i++){
            if(!isEqual(
                    pattern_map.get(pattern_map.keySet().iterator().next()),
                    str_map.get(str_map.keySet().iterator().next()))
            )
                return false;
        }
        return true;
    }

    public static boolean isEqual(List<Integer> a, List<Integer> b){
        if(a.size() != b.size())
            return false;

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) != b.get(i))
                return false;
        }
        return true;
    }
}
