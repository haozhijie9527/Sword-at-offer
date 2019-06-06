import java.util.ArrayList;
import java.util.Stack;

public class Test34 {
	ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null)
			return new ArrayList<>();
		if (root.val > target)
			return new ArrayList<>();
		int currentSum = 0;

		Stack<Integer> path = new Stack<>();
		FindPath(root, target, path, currentSum);
		return listAll;

	}

	private void FindPath(TreeNode root, int target, Stack<Integer> path, int currentSum) {
		currentSum += root.val;
		path.push(root.val);
		if (root.left == null && root.right == null && currentSum == target) {
			for (int i = 0; i < path.size(); i++) {
				list.add(path.get(i));
			}
			listAll.add(list);
			list=new ArrayList<>();
		}
		if (root.left != null)
			FindPath(root.left, target, path, currentSum);
		if (root.right != null)
			FindPath(root.right, target, path, currentSum);
		path.pop();
	}
}