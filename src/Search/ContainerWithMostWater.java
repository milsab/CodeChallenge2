package Search;

public class ContainerWithMostWater {
    public int maxArea(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        int maxArea = 0;
        while(left <= right){
            int area = (right - left) * Math.min(nums[left], nums[right]);
            maxArea = Math.max(maxArea, area);
            if(nums[left] > nums[right])
                right--;
            else
                left++;

        }
        return maxArea;
    }
}
