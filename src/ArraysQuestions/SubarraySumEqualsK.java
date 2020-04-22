package ArraysQuestions;

// find the total number of continuous subarrays whose sum equals to k

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.print(find(new int[] {1,1,1}, 2));
    }

    public static int find(int[] nums, int k){
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(memo.containsKey(sum - k)) {
                count += memo.get(sum - k);
            }
            memo.put(sum, memo.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
