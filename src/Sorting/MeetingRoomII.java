package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomII {
    public static void main(String[] args) {
        System.out.println(findMinRooms(new int[][]{{0,30},{5,10},{15,20}}));
    }

    public static int findMinRooms(int[][] meetings){
        if(meetings == null || meetings.length == 0)
            return 0;

        Arrays.sort(meetings, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });

        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[1] - b[1];
            }
        });

        heap.add(meetings[0]);

        for(int i = 1; i < meetings.length; i++){
            int[] meeting = heap.remove();
            if(meeting[1] <= meetings[i][0]){
                meeting[1] = meetings[i][1];
            } else {
                heap.add(meetings[i]);
            }
            heap.add(meeting);
        }
        return heap.size();
    }
}
