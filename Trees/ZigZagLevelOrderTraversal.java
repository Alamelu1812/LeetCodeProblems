/*
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to 
 * left for the next level and alternate between).
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(root == null)
            return result;
            
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        int currLevel = 1;
        
        while(!queue.isEmpty()){
            int n = queue.size();
            LinkedList<Integer> list = new LinkedList<Integer>();
            
            //Elements added in normal order for odd rows
            if(currLevel%2 == 1){
            
                for(int i = 0;i < n;i++){
                    TreeNode currNode = queue.poll();
                    
                    list.add(currNode.val);
                    
                    if(currNode.left!=null)
                        queue.add(currNode.left);
                        
                    if(currNode.right!=null)
                        queue.add(currNode.right);
                        
                }
            }
            
            //Elements added in reverse order for even rows
            else{
                for(int i = 0;i < n;i++){
                    TreeNode currNode = queue.poll();
                    
                    list.addFirst(currNode.val);
                    
                    if(currNode.left!=null)
                        queue.add(currNode.left);
                        
                    if(currNode.right!=null)
                        queue.add(currNode.right);
                }
            }
            
            result.add(list);
            currLevel++;
        }
        
        return result;
    }
}
