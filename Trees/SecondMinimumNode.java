/*
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has 
 * exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two 
 * sub-nodes.
 *
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole 
 * tree.
 * 
 * If no such second minimum value exists, output -1 instead.
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
    int secondMin = Integer.MAX_VALUE, firstMin = Integer.MAX_VALUE;
    
    public int findSecondMinimumValue(TreeNode root) {
        if(root.val < firstMin){
        
            secondMin = firstMin;
            firstMin = root.val;
            
            if(root.left != null )
                findSecondMinimumValue(root.left);
                
            if(root.right != null )
                findSecondMinimumValue(root.right);
        }
        
        else if(root.val < secondMin && root.val > firstMin){
            secondMin = root.val;
            
            if(root.left != null )
                findSecondMinimumValue(root.left);
                
            if(root.right != null )
                findSecondMinimumValue(root.right);
        }
        else if(root.val == firstMin || root.val == secondMin){
            if(root.left != null )
                findSecondMinimumValue(root.left);
                
            if(root.right != null )
                findSecondMinimumValue(root.right);
        }
        
        return secondMin == Integer.MAX_VALUE? -1:secondMin;
    }
}
