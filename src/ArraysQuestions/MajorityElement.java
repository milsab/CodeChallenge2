package ArraysQuestions;

import java.util.HashMap;

//find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//You may assume that the array is non-empty and the majority element always exist in the array.
public class MajorityElement {
    public static void main(String[] args) {
        System.out.print(majorityElement(new int[] {2,2,1,1,1,2,2}));
    }

    public static  int majorityElement(int[] nums) {
        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int ans = -1;
        for(int x : map.keySet()){
            if(map.get(x) > len / 2){
                ans = x;
                break;
            }
        }
        return ans;
    }
}
