package Search;

public class BadVersion {
    public static void main(String[] args) {

    }

    public static int findBad(int n){
        int left = 0;
        int right = n;

        while(left <= right){
            int mid = left + (right - left) / 2;
//            if(isBadVersion(mid) == true && isBadVersion(mid - 1) == false)
//                return mid;
            if(isBadVersion(mid) == true){
                right = mid;
            } else{
                left = mid + 1;
            }
        }
        return left;
    }

    static boolean isBadVersion(int version){

    }
}
