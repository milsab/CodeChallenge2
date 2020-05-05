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

    // Quick Select Approach
    public static int find_2(int[] nums, int k){
        int targetIndex = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, targetIndex);
    }

    public static int quickSelect(int[] nums, int left, int right, int targetIndex){

        int pivot = findPivot(nums, left, right);

        if(pivot == targetIndex){
            return nums[targetIndex];
        }

        if(pivot < targetIndex){
            return quickSelect(nums, pivot + 1, right, targetIndex);
        } else{
            return quickSelect(nums, left, pivot -1, targetIndex);
        }

    }

    public static int findPivot(int[] nums, int left, int right){
        int pivotIndex = left;
        int pivot = nums[left];

        for(int i = left; i < nums.length; i++){
            if(nums[i] < pivot){
                pivotIndex++;
                int temp = nums[i];
                nums[i] = nums[pivotIndex];
                nums[pivotIndex] = temp;
            }
        }

        int temp = nums[pivotIndex];
        nums[pivotIndex] = nums[left];
        nums[left] = temp;

        return pivotIndex;
    }
}
