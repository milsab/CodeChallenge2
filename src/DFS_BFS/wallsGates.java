package DFS_BFS;


//Given a m x n 2D grid initialized with these three possible values.
//
//-1 - A wall or an obstacle.
//0 - A gate.
//INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF
//as you may assume that the distance to a gate is less than 2147483647.
//Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate,
//it should be filled with INF.

public class wallsGates {
    public static void main(String[] args) {

    }

    public static void fillRooms(int[][] rooms){
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[0].length; j++){
                if(rooms[i][j] == 0){
                    dfs(rooms, i, j, 0);
                }
            }
        }
    }

    public static void dfs(int[][] rooms, int i, int j, int distance){
        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < distance || rooms[i][j] == 1)
            return;

        rooms[i][j] = distance;

        dfs(rooms, i + 1, j, distance + 1);
        dfs(rooms, i - 1, j, distance + 1);
        dfs(rooms, i, j + 1, distance + 1);
        dfs(rooms, i, j - 1, distance + 1);

    }
}
