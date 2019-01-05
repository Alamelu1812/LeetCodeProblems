/*
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their 
 * sum is equal to the given target.
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
    HashSet<Integer> numSet = new HashSet<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return false;
        if(numSet.contains(k - root.val))
            return true;
        
        numSet.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}

