package BitManipulation;

// given a sorted array consisting of only integers where every element appears exactly twice,
// except for one element which appears exactly once. Find this single element that appears only once.
//
// Example 1:
//
// Input: [1,1,2,3,3,4,4,8,8]
// Output: 2

public class SingleElement {
    public static void main(String[] args) {
        System.out.print(findSingleElement(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    public static int findSingleElement(int[] nums){
        int x = 0;
        for(int n : nums){
            x ^= n;
        }
        return x;
    }
}
