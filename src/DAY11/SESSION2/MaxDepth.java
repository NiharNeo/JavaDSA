package DAY11.SESSION2;

public class MaxDepth {
    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int righ = maxDepth(root.right);
        return 1+ Math.max(left,righ);

    }
}
