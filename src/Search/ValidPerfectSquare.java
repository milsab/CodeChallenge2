package Search;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num) {
        if(num < 2)
            return true;
        long left  = 2;
        long right = num / 2;

        while(left <= right){
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            if(sq == num)
                return true;

            if(sq < num){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return false;
    }
}
