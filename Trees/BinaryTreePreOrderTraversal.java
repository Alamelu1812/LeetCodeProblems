/*
 * Binary Tree Preorder Traversal Without Recursion
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if(root == null)
            return result;
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            
            result.add(currNode.val);
            
            //Push children in reverse order (ie) right child pushed before left child
            if(currNode.right!=null)
                stack.push(currNode.right);
            
            if(currNode.left!=null)
                stack.push(currNode.left);
            
        }
        
        return result;
    }
}
