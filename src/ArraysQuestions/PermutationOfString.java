package ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        for(String s : permutation("ABC")){
            System.out.println(s);
        }
    }

    static List<String> result = new ArrayList<>();
    public static List<String> permutation(String s){
        BT(s, new StringBuilder());
        return result;
    }

    private static void BT(String s, StringBuilder cur){
        if(cur.length() == s.length()){
            result.add(cur.toString());
            return;
        }

        for(int i = 0; i < s.length(); i++){
            // choose
            if(cur.indexOf(Character.toString(s.charAt(i))) != -1)
                continue;
            cur.append(s.charAt(i));
            // explore
            BT(s, cur);
            // unchoose
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
