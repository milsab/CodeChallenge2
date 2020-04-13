package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

//We have a collection of stones, each stone has a positive integer weight.
//
//Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
//
//If x == y, both stones are totally destroyed;
//If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
//At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

public class LastStone {
    public static void main(String[] args) {
        System.out.println(findLastWeight(new int[] {2,7,4,1,8,1}));
    }

    public static int findLastWeight(int[] stones){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : stones){
            maxHeap.add(x);
        }

        while(maxHeap.size() > 1){
            int a = maxHeap.remove();
            int b = maxHeap.remove();

            maxHeap.add(a - b);
        }

        if(maxHeap.size() == 1)
            return maxHeap.remove();
        else
            return 0;
    }
}
