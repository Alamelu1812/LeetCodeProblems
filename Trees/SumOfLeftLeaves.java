/*
 * Find the sum of all left leaves in a given binary tree.
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
    int leftLeafSum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return leftLeafSum;
            
        return sumOfLeftLeaves(root,false);
    }
    
    public int sumOfLeftLeaves(TreeNode root,boolean isLeftChild){
        if(root == null)
            return leftLeafSum;
            
        if(root.left == null && root.right == null && isLeftChild)
            leftLeafSum += root.val;
            
        sumOfLeftLeaves (root.left,true);
        sumOfLeftLeaves (root.right,false);
        
        return leftLeafSum;
    }
}
