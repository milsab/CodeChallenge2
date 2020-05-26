package DynamicProgramming;


public class Decode {
    public static void main(String[] args) {
        System.out.print(findDecodeWays("326"));
    }

    public static int findWays(String s){
        int len = s.length();
        int[] dp = new int[len + 1];

        for(int i = 0; i < s.length(); i++){

        }

    }

    public static int findDecodeWays(String s){
        int len = s.length();
        int[] dp = new int[len + 1];

        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for(int i = 2; i <= len; i++){
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int doubleDigit = Integer.parseInt(s.substring(i - 2, i));

            if(oneDigit >= 1 && oneDigit <= 9)
                dp[i] = dp[i -1];
            if(doubleDigit >= 10 && doubleDigit <= 26)
                dp[i] += dp[i - 2];
        }
        return dp[len];
    }
}
