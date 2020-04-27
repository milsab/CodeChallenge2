package DynamicProgramming;

public class MaximalSquare {
    public static void main(String[] args) {
        System.out.println(findMaxSq(new String[][] {{"1","0","1","0","0"},{"1","0","1","1","1"},{"1","1","1","1","1"},{"1","0","0","1","0"}}));
    }

    public static int findMaxSq(String[][] matrix){
        if(matrix.length == 0)
            return 0;

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        int maxSq = 0;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(matrix[i - 1][j - 1] == "1"){
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    maxSq = Math.max(dp[i][j], maxSq);
                }
            }
        }
        return maxSq * maxSq;
    }
}
