package StackQueue;

import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.pull(2);
        q.pull(40);
        q.pull(56);
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.pull(100);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }

    static class Queue{
        private Stack<Integer> pullStack = new Stack<>();
        private Stack<Integer> removeStack = new Stack<>();

        public void pull(int x){
            while(!removeStack.isEmpty()){
                pullStack.push(removeStack.pop());
            }
            pullStack.push(x);
        }

        public Integer remove(){
            while(! pullStack.isEmpty()){
                removeStack.push(pullStack.pop());
            }
            return removeStack.isEmpty() ? null : removeStack.pop();
        }

        public Integer peek(){
            while(! pullStack.isEmpty()){
                removeStack.push(pullStack.pop());
            }
            return removeStack.isEmpty() ? null : removeStack.peek();
        }
    }
}
