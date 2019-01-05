/*
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to 
 * the original key plus sum of all keys greater than the original key in BST.
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
    int prevSum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
            return root;
        convertBST(root.right);
        root.val = prevSum + root.val;
        prevSum = root.val;
        convertBST(root.left);
        return root;
    }
}
