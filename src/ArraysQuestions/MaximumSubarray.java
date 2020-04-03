package ArraysQuestions;

//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.print(findSum(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int findSum(int[] nums){
        int localSum = nums[0];
        int globalSum = nums[0];

        for(int i = 0; i < nums.length; i++){
            localSum = Math.max(localSum + nums[i], nums[i]);
            globalSum = Math.max(globalSum, localSum);
        }

        return globalSum;
    }
}
