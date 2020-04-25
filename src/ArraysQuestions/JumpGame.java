package ArraysQuestions;

// Determine if you are able to reach the last index.
// Each element in the array represents your maximum jump length at that position.

public class JumpGame {
    public static void main(String[] args) {
        System.out.print(isReach(new int[] {2,3,1,0,4}));
    }

    public static boolean isReach(int[] nums){
        int lastPosition = nums.length - 1;

        for(int i = lastPosition; i >= 0; i--){
            if(i + nums[i] >= lastPosition)
                lastPosition = i;
        }
        return lastPosition == 0;
    }
}
