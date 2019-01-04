/*
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
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
    List<Double> averageList = new ArrayList<Double>();
    
    public List<Double> averageOfLevels(TreeNode root) {
    
        if(root == null)
            return averageList;
            
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            Double levelSum = 0.0; //level sum is the sum of all node values in a particular level
            
            for(int i=0;i<n;i++){
            
                TreeNode currNode = queue.poll();
                
                levelSum += currNode.val;
                
                if(currNode.left != null)
                    queue.add(currNode.left);
                    
                if(currNode.right != null)
                    queue.add(currNode.right);
            }
            
            Double levelAverage = (Double)levelSum/n; //average is computed using levelSum and number of nodes in the level
            averageList.add(levelAverage);
        }
        return averageList;
    }
}
