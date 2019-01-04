class Solution {
    
    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTree(root,root.val);
    }
    
    public boolean isUnivalTree(TreeNode root,int value) {
        if(root == null)
            return true;
        
        if(root.val!=value)
            return false;
        
        return isUnivalTree(root.left,value) && isUnivalTree(root.right,value);
    }
}
