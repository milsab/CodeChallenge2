package DynamicProgramming;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
// determine if s can be segmented into a space-separated sequence of one or more dictionary words.
// Input: s = "applepenapple", wordDict = ["apple", "pen"]
// Output: true
public class WordBreak {
    public static void main(String[] args) {
        System.out.println(isBreakable("appleenpenple", new ArrayList<>(Arrays.asList("apple", "pen", "pple"))));
    }

    public static boolean isBreakable(String s, List<String> dict){
        int len = s.length();
        HashSet<String> set = new HashSet<>(dict);

        boolean[] dp = new boolean[len + 1];
        dp[0] = true; // dummy head

        for(int i = 1; i <= len; i++){
            for(int j = 0; j < i; j++){
                if(dp[j]){
                    String word = s.substring(j, i);
                    if(set.contains(word))
                        dp[i] = true;
                }
            }
        }
        return dp[len];
    }
}
