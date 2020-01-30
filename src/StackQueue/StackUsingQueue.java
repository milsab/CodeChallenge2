package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.push(2);
        stk.push(40);
        stk.push(56);
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        stk.push(100);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }

    static class Stack{
        private Queue<Integer> q1 = new LinkedList<>();
        private Queue<Integer> q2 = new LinkedList<>();

        public void push(int x){
            if(q1.isEmpty() && q2.isEmpty())
                q1.add(x);
            if(q1.isEmpty()) q2.add(x);
            if(q2.isEmpty()) q1.add(x);
        }

        public Integer pop(){
            if(isEmpty())
                return null;
            if(q1.isEmpty()){
                while(q2.size() > 1){
                    q1.add(q2.remove());
                }
                return q2.remove();
            } else{
                while(q1.size() > 1){
                    q2.add(q1.remove());
                }
                return q1.remove();
            }
        }

        public Integer peek(){
            if(isEmpty())
                return null;
            if(q1.isEmpty()){
                while(q2.size() > 1){
                    q1.add(q2.remove());
                }
                return q2.peek();
            } else{
                while(q1.size() > 1){
                    q2.add(q1.remove());
                }
                return q1.peek();
            }
        }

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
    }
}
