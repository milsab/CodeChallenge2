package StackQueue;


import java.util.Stack;

// find the next greater element for each element of the array in order of their appearance in the array
// in a circular way.
// If no such element exists, output -1
// 5, 3, 2, 4 ==> -1, 4, 4, 5
public class NextLargerElement {
    public static void main(String[] args) {
        for(int x : find(new int[]{5, 3, 2, 4})){
            System.out.print(x + " ");
        }
    }

    public static int[] find(int[] nums){
        Stack<Integer> stk = new Stack<>();
        int len = nums.length;
        int[] ans = new int[len];

        // to implement the circular way, we pass through array twice.
        for(int i = 2* (len - 1); i >= 0; i--){
            if(stk.isEmpty()){
                ans[i % len] = -1;
            } else if(nums[i % len] < stk.peek()){
                ans[i % len] = stk.peek();
            } else{
                while(!stk.isEmpty() && nums[i % len] >= stk.peek()){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    ans[i % len] = -1;
                } else{
                    ans[i % len] = stk.peek();
                }
            }
            stk.push(nums[i % len]);
        }
        return ans;
    }
}
