package DAY11.SESSION1;

import javax.swing.tree.TreeNode;

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
