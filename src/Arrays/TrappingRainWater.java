package Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(find(new int[]{6,9,9}));
    }

    public static int find(int[] arr){
        int len = arr.length;

        int[] left = new int[len];
        left[0] = arr[0];
        for(int i = 1; i < len; i++){
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        int[] right = new int[len];
        right[len - 1] = arr[len - 1];
        for(int i = len - 2; i >= 0; i-- ){
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += Math.min(left[i], right[i]) - arr[i];
        }

        return sum;
    }
}
