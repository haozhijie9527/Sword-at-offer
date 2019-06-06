/**
 * 
 * @author Administrator
 *
 */
public class Test55 {

	// 方法一：多次重复遍历某个节点实现
	public boolean IsBalanced_Solution1(TreeNode root) {
		if (root == null)
			return true;
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		int diff = Math.abs(left - right);
		if (diff <= 1)
			return true;
		else
			return false;
	}

	// 计算树的深度
	private int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		return (left > right) ? (left + 1) : (right + 1);
	}

	// 方法二
	private boolean isBalanced = true;

	public boolean IsBalanced_Solution2(TreeNode root) {
		getDepth(root);
		return isBalanced;
	}

	private int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if (Math.abs(left - right) > 1) {
			isBalanced = false;
		}
		return left > right ? left + 1 : right + 1;
	}
}
