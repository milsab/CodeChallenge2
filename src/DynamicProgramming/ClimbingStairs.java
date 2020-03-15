package DynamicProgramming;

import java.util.HashMap;

// if you climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climb(6));
        System.out.println(climbM(6));
    }

    // Bottom Up Approach
    public static int climb(int n){
        if(n < 0) return -1;
        if(n <= 3) return n;
        int[] dp = new int[n + 1];

        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Top Down Approach (Memoization)
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int climbM(int n){
        if(n <= 3) return n;
        if(memo.containsKey(n))
            return memo.get(n);

        memo.put(n, climbM(n - 1) + climb(n - 2));
        return memo.get(n);
    }
}
