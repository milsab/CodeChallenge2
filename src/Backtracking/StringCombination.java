package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringCombination {
    public static void main(String[] args) {
        for(String s : findCombination("Milad", 3)){
            System.out.println(s);
        }
    }

    static List<String> ans = new ArrayList<>();
    static HashSet<Integer> set = new HashSet<>();
    public static List<String> findCombination(String s, int k){
        BT(s, new ArrayList<>(), 0, k);
        return ans;
    }

    static void BT(String s, ArrayList<Character> cur, int first, int k){
        if(cur.size() == k){
            int sum = 0;
            for(int x : cur)
                sum += x;
            if(set.add(sum)){
                ans.add(new String(cur.toString()));
            }
            return;
        }

        for(int i = first; i < s.length(); i++){
            // choose
            if(cur.contains(s.charAt(i)))
                continue;
            cur.add(s.charAt(i));
            // explore
            BT(s, cur, i + 1, k);
            // un-choose
            cur.remove(cur.size() - 1);
        }
    }
}
