package ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

// Given t sorted arrays. return all common elements
public class CommonNumbers {
    public static void main(String[] args) {
        for(int x : findCommon(new int[]{1,12,15,19,20,21}, new int[]{2,15,17,19,21,25,27})){
            System.out.printf("%d ", x);
        }
    }

    public static List<Integer> findCommon(int[] a, int[] b){
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while(i < a.length && j <b.length){
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            } else if(a[i] < b[j]){
                i++;
            } else{
                j++;
            }
        }
        return ans;
    }
}
