
import java.util.Arrays;
import java.util.Stack;

public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    Arrays.fill(result, -1);
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < 2 * n; i++) {
        int cur = nums[i % n];

        while (!stack.isEmpty() && nums[stack.peek()] < cur) {
            int index = stack.pop();
            result[index] = cur;
        }

        if (i < n) {
            stack.push(i % n);
        }
    }
    return result;
}
    public static void main(String[] args){

    }

