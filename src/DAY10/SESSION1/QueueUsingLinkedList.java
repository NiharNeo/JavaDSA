package DAY10.SESSION1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.offer(30);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.poll());

    }
}
