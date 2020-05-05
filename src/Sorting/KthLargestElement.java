package Sorting;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        System.out.println(find(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

    // Heap Approach
    public static int find(int[] nums, int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums){
            minHeap.add(i);
            if(minHeap.size() > k)
                minHeap.remove();
        }

        return minHeap.remove();
    }
}
