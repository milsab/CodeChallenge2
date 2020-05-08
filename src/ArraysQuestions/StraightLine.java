package ArraysQuestions;

// Check If It Is a Straight Line
public class StraightLine {
    public static void main(String[] args) {
        System.out.print(checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        double m = 0;
        if(coordinates[1][0] != x0)
            m = (coordinates[1][1] - y0) / (coordinates[1][0] - x0);
        else
            m = Double.MAX_VALUE;

        for(int i = 2; i < coordinates.length; i++){
            double d = 0;
            if(coordinates[i][0] != x0)
                d = (double)(coordinates[i][1] - y0) / (coordinates[i][0] - x0);
            else
                d = Double.MAX_VALUE;

            if(d != m)
                return false;
        }
        return true;
    }
}
