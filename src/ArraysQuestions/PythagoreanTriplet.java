package ArraysQuestions;

// Given an array of integers, write a function that returns true if
// there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

import java.util.Arrays;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        for(int x : findTriplet(new int[]{3, 2, 4, 6, 5}))
            System.out.println(x);
    }

    public static int[] findTriplet(int[] arr){
        int len = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < len; i++){
            arr[i] *= arr[i];
        }

        // c^2 = a^2 + b^2
        for(int c = len - 1; c > 1; c--){
            int a = 0;
            int b = c - 1;

            while(a < b){

                if(arr[c] > arr[a] + arr[b]){
                    a++;
                } else if(arr[c] < arr[a] + arr[b]){
                    b--;
                } else{
                    return new int[]{
                            (int)Math.sqrt(arr[a]),
                            (int)Math.sqrt(arr[b]),
                            (int)Math.sqrt(arr[c])
                    };
                }
            }
        }
        return new int[]{};
    }
}
