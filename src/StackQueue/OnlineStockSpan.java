package StackQueue;

// Write a class StockSpanner which collects daily price quotes for some stock,
// and returns the span of that stock's price for the current day.
//
// The span of the stock's price today is defined as the maximum number of
// consecutive days (starting from today and going backwards) for which the price of
// the stock was less than or equal to today's price.
//
// For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85],
// then the stock spans would be [1, 1, 1, 2, 1, 4, 6].

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OnlineStockSpan {

    // Second Approach
    Stack<Integer> prices, weights;

    public OnlineStockSpan() {
        prices = new Stack();
        weights = new Stack();
    }

    public int next(int price) {
        int w = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            w += weights.pop();
        }

        prices.push(price);
        weights.push(w);
        return w;
    }


    // First Approach
//    List<Integer> list;
//
//    public OnlineStockSpan() {
//        list = new ArrayList<>();
//    }
//
//    public int next(int price) {
//
//        list.add(price);
//        int ans = 0;
//
//        for(int i = list.size() - 1; i >= 0; i--){
//            if(list.get(i) <= price)
//                ans++;
//            else
//                break;
//        }
//        return ans;
//    }
}
