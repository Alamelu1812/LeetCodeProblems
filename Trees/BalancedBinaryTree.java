/*
 * Given a binary tree, determine if it is height-balanced.
 *
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {

    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
            
        return Math.abs(heightOfNode(root.left) - heightOfNode(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right); 
    }
    
    public int heightOfNode(TreeNode root){
        if(root == null)
            return 0;
            
        if(root.left == null && root.right == null)
            return 1;
            
        return 1 + Math.max(heightOfNode(root.left),heightOfNode(root.right));
    }
}
