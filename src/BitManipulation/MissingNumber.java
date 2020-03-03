package BitManipulation;
//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
// Input: [3,0,1]
// Output: 2

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissing(new int[] {3, 4, 6, 1, 2, 0}));
    }

    public static int findMissing(int[] nums){
        int missing = nums.length;

        for(int i =0; i < nums.length; i++){
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
