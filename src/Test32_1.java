import java.util.ArrayList;
import java.util.Stack;

public class Test32_1 {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		int layer = 1;
		// s1存奇数层节点
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		s1.push(pRoot);
		// s2存偶数层节点
		Stack<TreeNode> s2 = new Stack<TreeNode>();

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		while (!s1.empty() || !s2.empty()) {
			if (layer % 2 != 0) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (!s1.empty()) {
					TreeNode node = s1.pop();
					if (node != null) {
						temp.add(node.val);
						s2.push(node.left);
						s2.push(node.right);
					}
				}
				if (!temp.isEmpty()) {
					list.add(temp);
					layer++;
				}
			} else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (!s2.empty()) {
					TreeNode node = s2.pop();
					if (node != null) {
						temp.add(node.val);
						s1.push(node.right);
						s1.push(node.left);
					}
				}
				if (!temp.isEmpty()) {
					list.add(temp);
					layer++;
				}
			}
		}
		return list;
	}

}
