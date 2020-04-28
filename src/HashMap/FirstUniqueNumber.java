package HashMap;

//You have a queue of integers, you need to retrieve the first unique integer in the queue.
//
//Implement the FirstUnique class:
//
//FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
//int showFirstUnique() returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
//void add(int value) insert value to the queue.

import java.util.Iterator;
import java.util.LinkedHashMap;

public class FirstUniqueNumber {

    public static void main(String[] args) {
        FirstUniqueNumber fun = new FirstUniqueNumber(new int[] {7,7,7,7,7,7});
        fun.add(7);            // the queue is now [7,7,7,7,7,7,7]
        fun.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
        fun.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
        fun.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
        fun.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
        System.out.println(fun.showFirstUnique()); // return 17

    }

    static LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    public FirstUniqueNumber(int[] nums) {
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }

    public int showFirstUnique() {
        Iterator it = map.keySet().iterator();

        while(it.hasNext()){
            int key = (int) it.next();
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }

    public void add(int value) {
        map.put(value, map.getOrDefault(value, 0) + 1);
    }
}
