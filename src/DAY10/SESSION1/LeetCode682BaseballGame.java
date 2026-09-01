package DAY10.SESSION1;

import java.util.Stack;

public class LeetCode682BaseballGame {

        public int calPoints(String[] ops) {
            Stack<Integer> stack = new Stack();
            int res = 0;

            for(String op : ops) {
                if (op.equals("+")) {
                    int top = stack.pop();
                    int newtop = top + stack.peek();
                    stack.push(top);
                    stack.push(newtop);
                }
                else if (op.equals("C")) {
                    res -= stack.pop();
                    continue;
                }
                else if (op.equals("D")) {
                    stack.push(2 * stack.peek());
                }
                else {
                    stack.push(Integer.valueOf(op));
                }
                res += stack.peek();
            }
            return res;
        }

}
