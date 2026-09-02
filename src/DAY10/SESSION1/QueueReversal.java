package DAY10.SESSION1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {


    public static void reverseQueue(Queue<String> queue) {
        Stack<String> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args){
       Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        reverseQueue(queue);
   }

}
