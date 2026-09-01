package DAY10.SESSION2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Monotonicqueue {

    public static int[] monotonicQueue(int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : nums) {
            while (!deque.isEmpty() &&
                    deque.peekLast() < num) {
                deque.pollLast();
            }
            deque.addLast(num);
        }
        return deque.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public static void main(String[] args){

    }
}
