package ArraysQuestions;

// Input: [7,1,5,3,6,4]
// Output: 7
public class BuySell_2 {
    public static void main(String[] args) {
        System.out.println(findProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int findProfit(int[] nums){

        int maxProfit = 0;
        int totalProfit = 0;
        int minPrice = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < minPrice){
                minPrice = nums[i];
            } else{
                if(maxProfit < nums[i] - minPrice){
                    maxProfit = nums[i] - minPrice;
                    totalProfit += maxProfit;
                    minPrice = nums[i];
                    maxProfit = 0;
                }
            }
        }
        return totalProfit;
    }
}
