package DFS_BFS;

//Given a 2D board and a word, find if the word exists in the grid.
//
//The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those
//horizontally or vertically neighboring. The same letter cell may not be used more than once.
//
//Example:
//
//board =
//[
//  ['A','B','C','E'],
//  ['S','F','C','S'],
//  ['A','D','E','E']
//]
//
//Given word = "ABCCED", return true.
//Given word = "SEE", return true.
//Given word = "ABCB", return false.

public class WordSearch {
    public static void main(String[] args) {
        System.out.print(search(new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCCED"));
    }

    public static boolean search(char[][] board, String word){
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0) && search(board, i, j, word,0, visited))
                    return true;
            }
        }
        return false;
    }

    public static boolean search(char[][] board, int i, int j, String word, int index, boolean[][] visited){
        
        if(index == word.length())
            return true;

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index) || visited[i][j])
            return false;

        visited[i][j] = true;

        if(search(board, i + 1, j, word, index + 1, visited) ||
                search(board, i - 1, j, word, index + 1, visited) ||
                search(board, i, j + 1, word, index + 1, visited) ||
                search(board, i, j - 1, word, index + 1, visited)
           )
            return true;

        visited[i][j] = false;
        return false;
    }
}
