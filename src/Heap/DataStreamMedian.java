package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class DataStreamMedian {
    PriorityQueue<Integer> lo;
    PriorityQueue<Integer> hi;

    public DataStreamMedian(){
        hi = new PriorityQueue<>();
        lo = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void add(int x){
        if(lo.size() == hi.size()){
            hi.add(x);
            lo.add(hi.poll());
        } else if(lo.size() > hi.size()){
            lo.add(x);
            hi.add(lo.remove());
        }
    }

    public double getMedian(){
        if(lo.size() == hi.size())
            return (lo.peek() + hi.peek()) / 2.0;
        else
            return lo.peek();
    }
}
