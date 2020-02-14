package HanoiTower;

public class Solution {
    public static void main(String[] args) {
        solve(5, "1", "2", "3");
    }

    /**
     *
     * @param n Number of Disk
     * @param src Source
     * @param des Destination
     * @param aux Auxiliary
     */
    public static void solve(int n, String src, String aux, String des){
        if(n > 0){
            solve(n - 1, src, des, aux);
            System.out.print("Move " + src + " To " + des + "\n");
            solve(n - 1, aux, src, des);

        }
    }
}
