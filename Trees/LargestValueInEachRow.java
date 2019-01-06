/*
 * You need to find the largest value in each row of a binary tree.
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null)
            return result;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int n = queue.size();
            int maxRowValue = Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++){
                TreeNode currNode = queue.poll();
                
                maxRowValue = Math.max(maxRowValue,currNode.val);
                
                if(currNode.left!=null)
                    queue.add(currNode.left);
                
                if(currNode.right!=null)
                    queue.add(currNode.right);
            }
            result.add(maxRowValue);
        }
        return result;
    }
}
