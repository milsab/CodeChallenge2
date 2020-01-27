package Strings;

import java.util.Arrays;


// remove duplicates in space o(1)
public class RemoveDuplicateString {
    public static void main(String[] args) {
        System.out.println(remove("geeksforgeeks"));
    }

    public static String remove(String s){
        boolean[] chars = new boolean[256];
        Arrays.fill(chars, false);

        for(int i : s.toCharArray()){
            chars[i] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length;i++){
            if(chars[i]) sb.append((char) i);
        }
        return sb.toString();
    }
}
