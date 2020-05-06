package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        for(String s: permute("123")){
            System.out.println(s);
        }
    }

    static List<String> ans = new ArrayList<>();
    public static List<String> permute(String s){

        BT(s, new ArrayList<Character>());
        return ans;
    }

    public static void BT(String s, List<Character> cur){
        if(s.length() ==cur.size() ){
            ans.add(String.valueOf(cur));
            return;
        }

        for(int i = 0; i < s.length(); i++){
            if(cur.contains(s.charAt(i)))
                continue;
            // choose
            cur.add(s.charAt(i));

            // explore
            BT(s, cur);

            // unchoose
            cur.remove(cur.size() - 1);
        }
    }
}
