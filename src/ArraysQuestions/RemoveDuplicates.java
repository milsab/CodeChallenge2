package ArraysQuestions;

import java.util.Arrays;

// Remove Duplicates from an Array in Place, and return the length of the modified array
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.print(remove(new int[] {5,17,1,8,15,5,18,18,1}));
    }

    public static int remove(int[] nums){
        int slow = 0;
        int fast = 1;

        Arrays.sort(nums);
        while(fast < nums.length){
            if(nums[slow] != nums[fast]){
                nums[++slow] = nums[fast];
            }
            fast++;
        }

        return ++slow;
    }
}
