package ArraysQuestions;

//find the max len of a contiguous subarray with equal number of 0 and 1.
public class ContiguousArray {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{0, 1, 0, 1}));
    }

    public static int findMax(int[] nums){
        int first = 0;
        int max = 0;

        while(first < nums.length -1){
            int second = first + 1;
            int zero = nums[first] == 0 ? 1 : 0;
            int one = nums[first] == 1 ? 1 : 0;
            while(second < nums.length){
                if(nums[second] == 0)
                    zero++;
                else
                    one++;

                second++;
                if(zero == one){

                    max = Math.max(max, second - first);
                }

            }
            first++;
        }
        return max;
    }
}
