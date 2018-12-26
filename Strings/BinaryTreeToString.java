

/*
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder 
 * traversing way.
 * 
 * The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty 
 * parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original
 * binary tree.
 * 
 * 
 */
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int d) {
		data = d;
		left = null;
		right = null;
	}
}


public class BinaryTreeToString {
	
	TreeNode root = null;
	
	public String tree2str(TreeNode t) {
        StringBuilder result = new StringBuilder();
        if(t==null)
        	return result.toString();
        result.append(t.data);
        if(t.left!=null || t.right!=null) {
        	result.append("(");
        	result.append(tree2str(t.left));
        	result.append(")");
        }
        if(t.right!=null) {
        	result.append("(");
        	result.append(tree2str(t.right));
        	result.append(")");
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		BinaryTreeToString object = new BinaryTreeToString();
		object.root = new TreeNode(1);
		object.root.left = new TreeNode(2);
		object.root.right = new TreeNode(3);
		object.root.left.left = new TreeNode(4);
		object.root.left.right = new TreeNode(5);
		
		String result = object.tree2str(object.root);
		System.out.println(result);
	}

}
