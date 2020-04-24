package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumber {
    public static void main(String[] args) {
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        for(String s : findCombination("23"))
            System.out.printf("%s ", s);
    }

    static HashMap<String, String> map = new HashMap<>();
    static List<String> ans = new ArrayList<>();

    public PhoneNumber(){

    }

    public static List<String> findCombination(String digits){
        if(digits.length() != 0)
            BT(digits, "");
        return ans;
    }

    public static void BT(String digits, String cur){
        if(digits.length() == 0){
            ans.add(cur);
            return;
        }

        String digit = digits.substring(0, 1);
        String letters = map.get(digit);

        for(char c : letters.toCharArray()){
            BT(digits.substring(1), cur + c);
        }
    }
}
