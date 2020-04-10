package Design;

import java.util.Stack;

public class MinStack {

    static Stack<Node> stack;

    public static void main(String[] args) {
        MinStack ms = new MinStack();

        push(23);
        push(12);
        push(14);
        push(4);
        System.out.println(getMin());
        System.out.println(pop());
        System.out.println(getMin());
        System.out.println(top());
    }

    public static class Node{
        private int val;
        private int min;

        public Node(int v, int m){
            val = v;
            min = m;
        }

        public int getVal(){
            return val;
        }

        public int getMin(){
            return min;
        }

        public void setMin(int m){
            min = m;
        }

        public void setVal(int v){
            val = v;
        }
    }

    public MinStack(){
        stack = new Stack<>();
    }

    public static void push(int v){
        int min;
        if(stack.isEmpty())
            min = v;
        else
            min = Math.min(stack.peek().getMin(), v);
        Node newNode = new Node(v, min);
        stack.push(newNode);
    }

    public static Integer pop(){
        if(stack.isEmpty())
            return null;

        return stack.pop().getVal();
    }

    public static Integer getMin(){
        if(stack.isEmpty())
            return null;

        return stack.peek().getMin();
    }

    public static Integer top(){
        if(stack.isEmpty())
            return null;

        return stack.peek().getVal();
    }
}
