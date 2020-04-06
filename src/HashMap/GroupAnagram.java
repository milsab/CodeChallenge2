package HashMap;

//Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//Output:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]


import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        for(List<String> list : findAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"})){
            for(String s : list){
                System.out.printf("%s ", s);
            }
            System.out.println();
        }
    }

    public static List<List<String>> findAnagrams(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }

         return new ArrayList<>(map.values());
    }
}
