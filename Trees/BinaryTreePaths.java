/*
 * Given a binary tree, return all root-to-leaf paths.
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
    List<String> result = new ArrayList<String>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return result;
            
        String path = new String();
        return binaryTreePaths(root,path);
    }
    
    public List<String> binaryTreePaths(TreeNode root,String path){
        if(root == null)
            return result;
            
        if(root.left == null && root.right == null){
            path = path + root.val;
            result.add(path);
            return result;
        }
        
        path = path + root.val +"->";
        
        if(root.left!=null)
            binaryTreePaths(root.left,path);
            
        if(root.right!=null)
            binaryTreePaths(root.right,path);
            
        return result;
    }
}
