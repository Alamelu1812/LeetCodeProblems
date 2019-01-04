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

    public void getLeafSequence(TreeNode root,List<Integer> list){
        //If root is null, no work is done
        if(root == null)
            return;
            
        //If it is a leaf node, it is added to sequence    
        else if(root.left == null && root.right == null)
            list.add(root.val);
        
        //Depth First Traversal of a tree is performed
        getLeafSequence(root.left,list);
        getLeafSequence(root.right,list);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    
        //Get leaf sequence of botht he trees
        List<Integer> list1 = new ArrayList<Integer>();
        getLeafSequence(root1,list1);
        
        List<Integer> list2 = new ArrayList<Integer>();
        getLeafSequence(root2,list2);
        
        //If the sequence length does not match, return false
        if(list1.size()!=list2.size())
            return false;
        
        //Compare sequences element by element
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i))
                return false;
        }
        
        return true;
    }
}
