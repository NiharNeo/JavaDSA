package DAY11.SESSION1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Nodee {
    int data;
    Nodee left, right;

    Nodee(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrder {
    public static List<List<Integer>> levelOrder(Nodee root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Nodee> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                Nodee node = queue.poll();
                level.add(node.data);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
