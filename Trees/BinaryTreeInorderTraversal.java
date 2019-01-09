/* 
 * Inorder Traversal without Recursion
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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode currNode = root;
        
        if(root == null)
            return result;
        
        while(currNode!=null || !stack.isEmpty()){
            while(currNode!=null){
                stack.push(currNode);
                currNode = currNode.left;
            }
            if(!stack.isEmpty())
                currNode = stack.pop();
            
            result.add(currNode.val);
            
            currNode = currNode.right;
        }
        return result;
    }
}
