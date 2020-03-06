package Backtracking;


import java.util.ArrayList;
import java.util.List;

// Input: [1,2,3]
// Output:
// [
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
// ]
public class Permutation {
    public static void main(String[] args) {
        for(List<Integer> x : permute(new int[]{1,2,3})){
            for(int i : x){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums){
        BT(nums, new ArrayList<Integer>());
        return ans;
    }

    static void BT(int[] nums, List<Integer> cur){

        if(cur.size() == nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            // choose
            if(cur.contains(nums[i]))
                continue;
            cur.add(nums[i]);

            // explore
            BT(nums, cur);

            // un-choose
            cur.remove(cur.size() - 1);

        }
    }
}
