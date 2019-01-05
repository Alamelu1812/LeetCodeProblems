
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
    public TreeNode invertTree(TreeNode root) {
        //If root is null or if a root is leaf node, return the root node
        if(root == null || (root.left == null && root.right == null))
            return root;
        
        //Call function recursively for children
        if(root.left!=null)
            invertTree(root.left);
            
        if(root.right!=null)
            invertTree(root.right);
        
        //Swap left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        //Return root
        return root;
    }
}
