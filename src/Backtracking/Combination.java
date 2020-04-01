package Backtracking;

import java.util.ArrayList;
import java.util.List;

// Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
// Input: n = 4, k = 2
//        Output:
//        [
//        [2,4],
//        [3,4],
//        [2,3],
//        [1,2],
//        [1,3],
//        [1,4],
//        ]
public class Combination {
    public static void main(String[] args) {
        for(List<Integer> list: findCombination(5, 3)){
            for(int x : list){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    static List<List<Integer>> ans = new ArrayList<>();
    static int n;
    static int k;
    public static List<List<Integer>> findCombination(int a, int b){
        n = a;
        k = b;
        BT(1, new ArrayList<>());
        return ans;
    }
    public static void BT(int first, ArrayList<Integer> cur){
        if(cur.size() == k)
            ans.add(new ArrayList(cur));

        for(int i = first; i <= n; i++){
            // choose
            cur.add(i);
            // explore
            BT(i + 1, cur);
            // un-choose
            cur.remove(cur.size() - 1);
        }
    }

}
