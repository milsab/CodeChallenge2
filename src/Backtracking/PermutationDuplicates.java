package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// return all possible unique permutations of an array with duplicates
public class PermutationDuplicates {
    public static void main(String[] args) {
        for(List x : permute(new int[]{1,1,2})){
            System.out.println(x);
        }
    }

    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums){
        Arrays.sort(nums);
        BT(nums, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }

    public static void BT(int[] nums, List<Integer> cur, boolean[] used){
        if(nums.length == cur.size()){
            if(!ans.contains(cur))
                ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0; i < nums.length; i++){

            if(used[i])
                continue;
            // choose
            used[i] = true;
            cur.add(nums[i]);

            // explore
            BT(nums, cur, used);

            // un-choose
            used[i] = false;
            cur.remove(cur.size() - 1);
        }
    }
}
