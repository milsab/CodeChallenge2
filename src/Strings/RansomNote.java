package Strings;

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {

        System.out.print(canConstruct("aab", "aabcdre"));
    }

    public static boolean canConstruct(String ransomeNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c , 0) + 1);
        }

        for(char c : ransomeNote.toCharArray()){
            if(map.containsKey(c)){
                int no = map.get(c);
                no--;
                if(no == 0){
                    map.remove(c);
                } else{
                    map.put(c, no);
                }
            } else{
                return false;
            }
        }

        return true;
    }
}
