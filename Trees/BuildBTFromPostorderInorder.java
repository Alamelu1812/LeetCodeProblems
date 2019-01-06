/*
 * Given inorder and postorder traversal of a tree, construct the binary tree.
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
    int postorderEnd = 0;
    
    public int indexInInorder(int[] inorder,int element){
    
        for(int i=0;i<inorder.length; i++){
            if(inorder[i] == element)
                return i;
        }
        
        return 0;
    }
    
    public TreeNode buildTree(int[] postorder, int[] inorder,int inorderStart,
                             int inorderEnd){
                             
        if(inorderStart<= inorderEnd){
          TreeNode root = new TreeNode(postorder[postorderEnd]);
          
          int inorderIndex = indexInInorder(inorder,postorder[postorderEnd--]);
          
          //Right subtree bilt before left subtree since we traverse postorder array from end
          root.right = buildTree(postorder,inorder,inorderIndex+1,inorderEnd);
          root.left = buildTree(postorder,inorder,inorderStart, inorderIndex-1);
          return root;
        }
        
        return null;
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length != inorder.length)
            return null;
            
        postorderEnd = postorder.length - 1;
        
        return buildTree(postorder,inorder,0,postorder.length-1);
    }

}
