package Backtracking;

//Given a collection of numbers that might contain duplicates, return all possible unique permutations.
//
//Example:
//
//Input: [1,1,2]
//Output:
//[
//  [1,1,2],
//  [1,2,1],
//  [2,1,1]
//]

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutation2 {
    public static void main(String[] args) {
        for(List l : permutation(new int[]{1,1,2})){
            for(Object i : l)
                System.out.printf("%d ", i);
            System.out.println();
        }

    }

    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> permutation(int[] nums){
        BT(nums, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }

    public static void BT(int[] nums, ArrayList<Integer> cur, boolean[] visited){
        if(nums.length == cur.size()){
            ans.add(new ArrayList<>(cur));
        }

        for(int i = 0; i < nums.length; i++){
            // choose
            if(visited[i] || i > 0 && nums[i - 1] == nums[i] && visited[i - 1])
                continue;
            cur.add(nums[i]);

            visited[i] = true;
            // explore
            BT(nums, cur, visited);

            // un-choose
            cur.remove(cur.size() - 1);

            visited[i] = false;
        }
    }
}
