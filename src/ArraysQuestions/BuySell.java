package ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

// The cost of stock on each day is given in an array A[] of size N.
// Find all the days on which you buy and sell
// the stock so that in between those days your profit is maximum.
public class BuySell {
    public static void main(String[] args) {
//        for(int[] x : maximizeProfit(new int[]{100, 180, 260, 310, 40, 535, 695})){
//            System.out.println(x[0] + " " + x[1]);
//        }
        System.out.println(maximizeProfit(new int[]{100, 180, 260, 310, 40, 535, 695}));
    }

    public static /*List<int[]>*/ int maximizeProfit(int[] arr){
        List<int[]> result = new ArrayList<>();
        int minPriceIndex = 0;
        int maxProfit = 0;
        int totalProfit = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[minPriceIndex]){
                minPriceIndex = i;
            } else if(maxProfit < arr[i] - arr[minPriceIndex]){
                maxProfit = arr[i] - arr[minPriceIndex];
                totalProfit += maxProfit;
                minPriceIndex = i;
                maxProfit = 0;
                result.add(new int[]{minPriceIndex, i});
            }
        }
        return totalProfit;
    }
}
