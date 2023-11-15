package Stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //stack la 1 class
        Stack<String> stack = new Stack<>();
        stack.push("alo");
        stack.push("oho");
        stack.push("aha");
        stack.push("ehe");
        //lay ra phan tu
//        System.out.println("ptu lay ra dau tien " + stack.pop());
//        System.out.println("ptu lay ra thu 2 " + stack.pop());
//        System.out.println("ptu lay ra thu 3 " + stack.pop());
//        System.out.println("ptu lay ra cuoi cung " + stack.pop());
// queue la 1 interface
        Queue<Integer> queue = new ArrayDeque<>();
        //them ptu vao
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        // lay va xoa
//        System.out.println("ptu lay ra dau tien "+ queue.poll());
//        System.out.println("ptu lay ra tiep theo  "+ queue.poll());
//        System.out.println("ptu lay ra tiep theo "+ queue.poll());
//        System.out.println("ptu lay ra tiep theo "+ queue.poll());
        System.out.println(stack.toString());
        // lay ptu tren cung cua stack
        System.out.println("ptu tren cung cua stack la " + stack.peek());
        System.out.println(stack);
        System.out.println("lay va xoa ptu tren cung cua stack la " + stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        display();

    }

    public  static void display(){
        System.out.println("helo");
        display();
    }
}
