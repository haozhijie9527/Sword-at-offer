
public class Test37 {
	int index = -1;

	String Serialize(TreeNode root) {
		StringBuffer s = new StringBuffer();
		if (root == null) {
			s.append("$,");
			return s.toString();
		}
		s.append(root.val + ",");
		s.append(Serialize(root.left));
		s.append(Serialize(root.right));
		return s.toString();
	}

	TreeNode Deserialize(String str) {
		index++;
		int len = str.length();
		if (index >= len) {
			return null;
		}
		String[] s = str.split(",");
		TreeNode node = null;
		if (!s[index].equals("$")) {
			node = new TreeNode(Integer.valueOf(s[index]));
			node.left = Deserialize(str);
			node.right = Deserialize(str);
		}
		return node;

	}
}
