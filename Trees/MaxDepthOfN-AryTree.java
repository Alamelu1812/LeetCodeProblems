/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        else if(root.children.isEmpty())
            return 1;
        int maxChildDepth = Integer.MIN_VALUE;
        for(Node child:root.children)
            maxChildDepth = Math.max(maxChildDepth,maxDepth(child));
        return maxChildDepth+1;
    }
}

