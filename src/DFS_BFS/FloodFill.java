package DFS_BFS;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = new int[][]{{1,1,1}, {1,1,0}, {1,0,1}};
        fill(image, 1, 1, 2);
    }

    public static void fill(int[][] image, int r, int c, int newColor){
        int oldColor = image[r][c];
        dfs(image, r, c, oldColor, newColor);
        for(int[] row : image){
            for(int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(int[][] image, int r, int c, int oldColor, int newColor){
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != oldColor)
            return;

        image[r][c] = newColor;

        dfs(image, r + 1, c, oldColor, newColor);
        dfs(image, r , c + 1, oldColor, newColor);
        dfs(image, r - 1, c, oldColor, newColor);
        dfs(image, r, c - 1, oldColor, newColor);
    }
}
