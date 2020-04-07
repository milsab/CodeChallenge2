package ArraysQuestions;

import java.util.HashSet;

//count element x such that x + 1 is also in arr
//Input: arr = [1,3,2,3,5,0]
//Output: 3
//Input: arr = [1,1,2,2]
//Output: 2
public class CountingElements {
    public static void main(String[] args) {

        System.out.println(count(new int[] {1,3,2,3,5,0}));
    }

    public static int count(int[] nums){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        for(int x : nums){
            if(set.contains(x + 1))
                count++;
        }

        return count;
    }
}
