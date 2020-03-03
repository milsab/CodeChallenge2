package ArraysQuestions;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] res = twoSum(new int[] {2, 7, 5, 11, 4}, 17);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            } else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
