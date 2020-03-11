package Math;

// Input: 19
//Output: true
//Explanation:
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(20));
    }

    static HashSet<Integer> set = new HashSet<>();
    public static boolean isHappy(int x){
        int num = 0;

        while(x > 0){
            int mod = x % 10;
            num += mod * mod;
            x /= 10;
        }

        if(num == 1)
            return true;

        if(!set.add(num))
            return false;

        return isHappy(num);
    }
}
