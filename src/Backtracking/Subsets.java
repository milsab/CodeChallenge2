package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        for(List<Integer> list : findSubsets(new int[] {1,2,3})){
            for(Integer i : list){
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }

    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> findSubsets(int[] nums){
        BT(nums, new ArrayList<>(), 0);
        return ans;
    }

    public static void BT(int[] nums, List<Integer> cur, int start){
        ans.add(new ArrayList<>(cur));

        for(int i = start; i < nums.length; i++){

            // choose
            cur.add(nums[i]);

            // explore
            BT(nums, cur, i + 1);

            // un-choose
            cur.remove(cur.size() - 1);
        }
    }
}
