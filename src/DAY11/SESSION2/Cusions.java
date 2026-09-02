package DAY11.SESSION2;


//import javax.swing.tree.TreeNode;
import java.util.*;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Cusions {

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            boolean xCheck = false;
            boolean yCheck = false;
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();


                if (node.left != null && node.right != null) {
                    int left = node.left.val;
                    int right = node.right.val;
                    if ((left == x && right == y) || (left == y && right == x)) {
                        return false;
                    }
                }

                if (node.val == x) {
                    xCheck = true;
                }
                if (node.val == y) {
                    yCheck = true;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }


            if (xCheck && yCheck) {
                return true;
            }

            if (xCheck || yCheck) {
                return false;
            }
        }

        return false;
    }
    }

