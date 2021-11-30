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
}
