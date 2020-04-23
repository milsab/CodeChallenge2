package BitManipulation;

// Given a range [m, n] where 0 <= m <= n <= 2147483647,
// return the bitwise AND of all numbers in this range, inclusive.
public class BitwiseAND {
    public static void main(String[] args) {
        System.out.print(rangeBitwiseAnd(5, 16));
    }

    // Better Solution -- Time: O(1), Space: O(1)
    public static int rangeBitwiseAnd(int m, int n) {
        int shift = 0;

        while(m < n){
            m = m >> 1;
            n = n >> 1;
            shift++;
        }

        return m << shift;
    }

    // Brute force - Time Limited
    public static int rangeBitwiseAnd_1(int m, int n) {
        if(n == m) return n;
        if(n == m + 1) return m & n;


        int ans = m & (m + 1);
        for(int i = m + 2; i <= n; i++){
            ans = ans & i;
        }
        return ans;
    }
}
