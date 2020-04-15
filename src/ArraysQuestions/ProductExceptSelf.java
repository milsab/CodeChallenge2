package ArraysQuestions;

// Input:  [1,2,3,4]
// Output: [24,12,8,6]
public class ProductExceptSelf {
    public static void main(String[] args) {
        for(int i : product_2(new int[] {1,2,3,4,5})){
            System.out.printf("%d ", i);
        }
    }
    public static int[] product_2(int[] nums){
        int len = nums.length;
        int[] ans = new int[len];

        int left = 1;
        int right = 1;

        ans[0] = left;
        for(int i = 1; i < len; i++){
            left *= nums[i - 1];
            ans[i] = left;
        }

        ans[len -1] = left;
        for(int i = len - 2; i >= 0; i--){
            right *= nums[i + 1];
            ans[i] *= right;
        }
        return ans;
    }


    public static int[] product(int[] nums){
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = 1;
        for(int i = 1; i < len; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[len - 1] = 1;
        for(int i = len - 2; i >=0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] ans = new int[len];
        for(int i = 0; i < len; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
