/**
 * ���������
 * 
 * @author Administrator
 *
 */

public class Test27 {
	public void Mirror(TreeNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null)
			return;
		TreeNode temp = null;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		if (root.left != null)
			Mirror(root.left);
		if (root.right != null)
			Mirror(root.right);
	}
}
