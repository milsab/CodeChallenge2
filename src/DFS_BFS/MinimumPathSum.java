package DFS_BFS;

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

}
