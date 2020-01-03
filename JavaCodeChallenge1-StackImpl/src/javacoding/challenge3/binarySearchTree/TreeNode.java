package javacoding.challenge3.binarySearchTree;

public class TreeNode {
	private int val;
	private TreeNode left ;
	private TreeNode right;
	public TreeNode(int val) {
		super();
		this.val = val;
	}
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TreeNode [val=");
		builder.append(val);
		builder.append(", left=");
		builder.append(left);
		builder.append(", right=");
		builder.append(right);
		builder.append("]");
		return builder.toString();
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	

}
