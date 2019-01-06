/*
 * Given preorder and inorder traversal of a tree, construct the binary tree.
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
    int preorderStart = 0;
    
    public int indexInInorder(int[] inorder,int element){
    
        for(int i=0;i<inorder.length; i++){
            if(inorder[i] == element)
                return i;
        }
        
        return 0;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder,int inorderStart,
                             int inorderEnd){
                             
        if(inorderStart<= inorderEnd){
        TreeNode root = new TreeNode(preorder[preorderStart]);
        
        int inorderIndex = indexInInorder(inorder,preorder[preorderStart++]);
        
        root.left = buildTree(preorder,inorder,inorderStart, inorderIndex-1);
        
        root.right = buildTree(preorder,inorder,inorderIndex+1,inorderEnd);
        
        return root;
        }
        
        return null;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    
        if(preorder.length != inorder.length)
            return null;
            
        return buildTree(preorder,inorder,0,preorder.length-1);
    }
    
    
}
