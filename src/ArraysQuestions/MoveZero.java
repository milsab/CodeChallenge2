package ArraysQuestions;

//write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class MoveZero {
    public static void main(String[] args) {
        for(int x : move(new int[]{0,1,0,3,12})){
            System.out.printf("%d ", x);
        }
    }

    public static int[] move(int[] nums){
        int lastNonZeroIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        for(int i = lastNonZeroIndex; i < nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
}
