package BitManipulation;

// Given a non-empty array of integers, every element appears twice except for one. Find that single one.
// Input: [2,2,1]
// Output: 1
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(findNumber(new int[]{2,2,1}));
    }

    public static int findNumber(int[] nums){
        int num = 0;

        for(int x : nums){
            num ^= x;
        }
        return num;
    }
}
