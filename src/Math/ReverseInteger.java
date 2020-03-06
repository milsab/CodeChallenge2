package Math;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x){
        boolean isNegative = false;
        if(x < 0){
            x = -x;
            isNegative = true;
        }
        long ans = 0;

        while(x > 0){
            int mod = x % 10;
            ans = ans * 10 + mod;
            if(ans > Integer.MAX_VALUE) // Check Integer Overload
                return 0;
            x /= 10;
        }
        return isNegative ? -1 * (int)ans : (int)ans;

    }
}
