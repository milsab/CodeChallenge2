package DynamicProgramming;

public class MinimumPathSum {

    public static void main(String[] args) {
        System.out.print(minPathSum(new int[][]{{1,2,3}, {4,5,6}}));
    }

    // Recursion - Top Down Approach
    public static int minPathSum(int[][] grid) {

        dfs(grid, 0, 0, grid[0][0]);
        return minSum;
    }

    static int minSum = Integer.MAX_VALUE;
    public static void dfs(int[][] grid, int row, int col, int sum){
        if(row >= grid.length || col >= grid[0].length)
            return;

        sum += grid[row][col];

        if(row == grid.length - 1 && col == grid[0].length - 1){
            minSum = Math.min(minSum, sum);
            return;
        }

        dfs(grid, row + 1, col, sum);
        dfs(grid, row, col + 1, sum);
    }

    // Recursion - Bottom Up Approach
    public static int minPathSum_2(int[][] grid) {
        return rec(grid, 0, 0);
    }

    public static int rec(int[][] grid, int row, int col){
        if(row >= grid.length || col >= grid[0].length)
            return Integer.MAX_VALUE;
        if(row == grid.length - 1 && col == grid[0].length - 1)
            return grid[row][col];
        return grid[row][col] + Math.min(rec(grid, row + 1, col), rec(grid, row, col + 1));
    }

    // Dynamic Programming Approach
    public static int minPathSum_3(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[row - 1][col - 1] = grid[row - 1][col - 1];
        for(int i = row - 1; i >= 0 ; i--){
            for(int j = col - 1; j >= 0; j--){
                if(i < row - 1 && j < col - 1)
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                else if( i < row - 1)
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                else if( j < col - 1)
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
            }
        }
        return dp[0][0];
    }

}
