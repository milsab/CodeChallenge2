package DFS_BFS;

public class NumberOfIslands {
    public static void main(String[] args) {
        System.out.println(findNumber(new int[][] {}));
    }

    public static int findNumber(int[][] arr){
        int count = 0;
        for(int i  = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 1){
                    count++;
                    dfs(arr, i, j);
                }
            }
        }
        return count;
    }

    public static void dfs(int[][] arr, int row, int col){
        if(row < 0 || row >= arr.length || col < 0 || col >= arr[0].length || arr[row][col] == 0)
            return;

        // Sink the iland
        arr[row][col] = 0;
        dfs(arr, row + 1, col);
        dfs(arr, row - 1, col);
        dfs(arr, row, col + 1);
        dfs(arr, row, col - 1);

    }
}
