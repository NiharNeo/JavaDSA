package DAY11.SESSION1;


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class LeetCode144 {
    public class TreeNodee {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNodee() {}
        TreeNodee(int val) { this.val = val; }
        TreeNodee(int val, TreeNode left, TreeNode right) {this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preorderTraversal (TreeNodee root){

        Stack<TreeNodee> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        if(root == null) return result;

        stack.push(root);

        while(!stack.isEmpty()){

            TreeNodee temp = stack.pop();

            if(temp.right != null)
                stack.push((TreeNodee) temp.right);

            if(temp.left != null)
                stack.push((TreeNodee) temp.left);

            result.add(temp.val);
        }

        return result;

    }
}
