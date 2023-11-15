package b12;

import java.util.ArrayDeque;
import java.util.Queue;

public class b1 {
    public static void main(String[] args) {
        Queue<Integer> arrInt = new ArrayDeque<>();
        arrInt.offer(1);
        arrInt.offer(2);
        arrInt.offer(3);
        arrInt.offer(4);
        for (Integer a:arrInt
             ) {
            System.out.println(arrInt.poll());
        }
    }
}
