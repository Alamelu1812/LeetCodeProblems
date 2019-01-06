/* 
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null)
            return result;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            
            for(int i=0;i<n;i++){
            
                TreeNode currNode = queue.poll();
                
                list.add(currNode.val);
                
                if(currNode.left != null)
                    queue.add(currNode.left);
                    
                if(currNode.right != null)
                    queue.add(currNode.right);
            }
            result.add(list);
        }
        return result;
    }
}
