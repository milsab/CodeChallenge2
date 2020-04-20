package Search;


// Search in Rotated Sorted Array
public class SearchRotatedArr {
    public static void main(String[] args) {
        System.out.println(search(new int[] {0,1,2,4,5,6,7}, 4));
    }

    public static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        if(nums[pivot] == target)
            return pivot;
        if(pivot == 0)
            return binarySearch(nums, 0, nums.length - 1, target);
        if(target >= nums[0])
            return binarySearch(nums, 0, pivot - 1, target);
        else
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    public static int findPivot(int[] nums){
        if(nums[0] < nums[nums.length - 1])
            return 0;
        int len = nums.length;
        int lo = 0;
        int hi = len - 1;
        int ans = 0;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] > nums[mid + 1]){
                ans = mid + 1;
                break;
            }
            else if(nums[mid] > nums[0])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return ans;
    }

    public static int binarySearch(int[] nums, int lo, int hi, int target){
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }
}
