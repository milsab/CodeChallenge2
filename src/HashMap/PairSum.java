package HashMap;

import java.util.HashMap;

//Given a list of n integers arr[0..(n-1)],
// determine the number of different pairs of elements within it which sum to k.
public class PairSum {

    public static void main(String[] args) {
        System.out.print(numberOfWays(new int[] {1,5,4,3,8,3,4,3,2}, 7));
    }

    public static int numberOfWays(int[] arr, int k) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int x : arr){
            int target = k - x;
            if(map.containsKey(target)){
                ans += map.get(target);
            }
            if(x == target)
                ans--;
        }

        return ans / 2;
    }
}
