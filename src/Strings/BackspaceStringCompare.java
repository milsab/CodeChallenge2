package Strings;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// are two strings equal?
//# means a backspace character.
//Input: S = "ab#c", T = "ad#c"
//Output: true
public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(isEqual("a##c", "ad#c"));
    }

    public static boolean isEqual(String s1, String s2){
        List<String> arr1 = Arrays.asList(s1.split(""));
        List<String> arr2 = Arrays.asList(s2.split(""));

        String str1 = getFinalString(arr1);
        String str2 = getFinalString(arr2);

        return str1.equals(str2);
    }

    public static String getFinalString(List<String> list){
        StringBuilder ans = new StringBuilder();
        for(String s: list){
            if(s.equals("#") && ans.length() > 0){
                ans.deleteCharAt(ans.length() - 1);
            } else{
                ans.append(s);
            }
        }
        return ans.toString();
    }
}
