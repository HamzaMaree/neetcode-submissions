/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root != null){
            int x = height(root.left);
            int y = height(root.right);
            int leftHeight = x == -1 ? 0 : x;
            int rightHeight = y == -1 ? 0 : y;

            System.out.println(leftHeight + " " + rightHeight + " " + Math.abs(leftHeight-rightHeight));
            if(Math.abs(leftHeight-rightHeight) <= 1)
                return isBalanced(root.left) && isBalanced(root.right) ;
            else
                return false;
        }

        return true;
        
    }

    // This method is get the height 0-Based 

    public int height(TreeNode root){
        if(root == null)
            return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
}
