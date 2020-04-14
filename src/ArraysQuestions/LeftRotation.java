package ArraysQuestions;

// A left rotation operation on an array shifts each of the array's elements  unit to the left.
// For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2] .
// Given an array a of n integers and a number , d, perform d left rotations on the array.
// Return the updated array to be printed as a single line of space-separated integers.
public class LeftRotation {
    public static void main(String[] args) {

        for(int x : leftShift(new int[]{1,2,3,4,5, 9, 6}, 4))
            System.out.printf("%d ", x);
    }

    public static int[] leftShift(int[] nums, int shift){
        int ans[] = new int[nums.length];

        int index = 0;
        for(int i = shift; i < nums.length; i++){
            ans[index++] = nums[i];
        }
        int index2 = 0;
        for(int i = index; i < ans.length; i++){
            ans[i] = nums[index2++];
        }
        return ans;
    }
}
