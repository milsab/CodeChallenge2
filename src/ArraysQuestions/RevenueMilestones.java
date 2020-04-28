package ArraysQuestions;

// We keep track of the revenue Facebook makes every day,
// and we want to know on what days Facebook hits certain revenue milestones.
// Given an array of the revenue on each day, and an array of milestones Facebook wants to reach,
// return an array containing the days on which Facebook reached every milestone.
//
// revenues = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
// milestones = [100, 200, 500]
// output = [4, 6, 10]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;


public class RevenueMilestones {

    public static void main(String[] args) {
        for(int x : getMilestoneDays(new int[]{700, 800, 600, 400, 600, 700}, new int[]{3100, 2200, 800, 2100, 1000})){
            System.out.printf("%d ", x);
        }
    }

    static int[] getMilestoneDays(int[] revenues, int[] milestones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < milestones.length; i++){
            minHeap.add(milestones[i]);
            map.put(milestones[i], i);
        }
        int sum = 0;
        int[] ans = new int[milestones.length];
        for(int i = 0; i < revenues.length; i++){
            sum += revenues[i];
            while(!minHeap.isEmpty() && sum >= minHeap.peek()){
                ans[map.get(minHeap.remove())] = i + 1;
            }
        }

        return ans;
    }

    static Integer[] getMilestoneDays_1(int[] revenues, int[] milestones) {
        int index = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < revenues.length; i++){
            sum += revenues[i];
            if(sum >= milestones[index]){
                ans.add(i + 1);
                index++;
            }
        }
        Integer[] arr = new Integer[ans.size()];
        return ans.toArray(arr);
    }
}
