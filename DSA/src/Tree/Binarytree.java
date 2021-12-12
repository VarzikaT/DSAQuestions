package Tree;

public class Binarytree {
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;//can be generic type
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		root=first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;	
	}
		public static void main(String args[]) {
			Binarytree bt = new Binarytree();
			bt.createBinaryTree();
		}
		
		//using iteration
		public void preOrder(TreeNode root) {
			if(root==null) {
				return;
			}
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while(!stack.isEmpty()) {
				TreeNode temp = stack.pop();//temporary variable pointing to stack
				System.out.print(temp.data+" ");
				if(temp.right != null) {
					stack.push(temp.right);//push the Node's right child in the stack
				}
				if(temp.left != null) {
					stack.push(temp.left);
				}
			}
			
		//inorder traversal of binary tree using recursion
			public void inOrder(TreeNode root) {
				
			}
}
}