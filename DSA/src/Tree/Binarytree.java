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
		second.left = fouth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		
		
		
	}
		public static void main(String args[]) {
			BinaryTree bt = new BinaryTree();
			bt.createBinaryTree();
		}
	}
}