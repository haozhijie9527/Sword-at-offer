import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test32_2 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		if (root == null)
			return new ArrayList<>();
		Queue<TreeNode> list = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();
		TreeNode cur;
		list.add(root);
		while (!list.isEmpty()) {
			result.add(list.peek().val);
			cur = list.peek();
			if (cur.left != null) {
				list.add(cur.left);
			}
			if (cur.right != null) {
				list.add(cur.right);
			}
			list.poll();
		}
		return result;
	}
}