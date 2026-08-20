package DAY4.SESSION2;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueJava {
    public static void main(){
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(1);
        p.offer(9);
        System.out.println(p);
        p.poll();
        System.out.println(p);

    }
}
