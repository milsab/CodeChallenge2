package ArraysQuestions;

// Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
//
//Return the intersection of these two interval lists.

//Input: A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
//Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersections {

    public int[][] findIntervals(int[][] a, int[][] b){
        int i = 0;
        int j = 0;
        List<int[]> ans = new ArrayList<>();

        while(i < a.length && j < b.length){
            int lo = Math.max(a[i][0], b[j][0]);
            int hi = Math.min(a[i][1], b[j][1]);

            if(lo <= hi){
                ans.add(new int[]{lo, hi});
            }

            if(a[i][1] < b[j][1])
                i++;
            else
                j++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
