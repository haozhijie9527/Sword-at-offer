import java.util.Stack;

public class Test54 {
	// �ǵݹ�ʵ��
	TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot == null || k == 0)
			return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int count = 0;
		TreeNode node = pRoot;
		do {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				count++;
				if (count == k)
					return node;
				node = node.right;
			}
		} while (node != null || !stack.isEmpty());
		return null;
	}

	// �ݹ�ʵ��
	int index = 0;
	TreeNode KthNode1(TreeNode pRoot, int k) {
		if (pRoot != null) {
			TreeNode node = KthNode1(pRoot.left, k);
			if (node != null)
				return node;
			index++;
			if (index == k)
				return pRoot;
			node = KthNode1(pRoot.right, k);
			if (node != null)
				return node;
		}
		return null;
	}
}