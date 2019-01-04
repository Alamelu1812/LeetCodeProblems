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
    List<List<Integer>> levelOrderTraversal = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null)
            return levelOrderTraversal;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                Node currNode = queue.poll();
                for(Node child:currNode.children)
                    queue.add(child);
                level.add(currNode.val);
            }
            levelOrderTraversal.add(level);
        }
        return levelOrderTraversal;
    }
}

