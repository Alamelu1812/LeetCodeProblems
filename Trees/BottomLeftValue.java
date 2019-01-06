/*
 * Given a binary tree, find the leftmost value in the last row of the tree.
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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null)
            return 0;
            
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        int bottomLeftValue = 0;
        
        while(!queue.isEmpty()){
        
            int n = queue.size();
            
            for(int i=0;i<n;i++){
            
                TreeNode currNode = queue.poll();
                
                if(i == 0)
                    bottomLeftValue = currNode.val;
                
                if(currNode.left != null)
                    queue.add(currNode.left);
                
                if(currNode.right != null)
                    queue.add(currNode.right); 
                    
            }   
            
        }
        
        return bottomLeftValue;
    }
    
}
