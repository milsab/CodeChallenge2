package HashMap;

//Given a non-empty array of integers, return the k most frequent elements.
//
//Example 1:
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]


import java.util.*;

public class TopFrequentElements {
    public static void main(String[] args) {
        for(int x : topFreq(new int[] {1,3,5,2,2,8,5,5}, 2)){
            System.out.println(x);
        }
    }

    public static List<Integer> topFreq(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                new Comparator<Integer>(){
                    public int compare(Integer a, Integer b){
                        return map.get(a) - map.get(b);
                    }
                }
        );

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int x : map.keySet()){
            minHeap.add(x);
            if(minHeap.size() > k ){
                minHeap.remove();
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(!minHeap.isEmpty()){
            ans.add(minHeap.remove());
        }
        return ans;
    }
}
