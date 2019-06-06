import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String[] a = in.nextLine().split(" ");
	String[] b = in.nextLine().split(" ");
	int[] preOrder = new int[a.length];
	int[] inOrder = new int[b.length];
	for (int i = 0; i < preOrder.length; i++) {
	    preOrder[i] = Integer.valueOf(a[i]);
	    inOrder[i] = Integer.valueOf(b[i]);
	}
	reConstructBinaryTree(preOrder, inOrder);
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
	if (pre.length == 0 || in.length == 0) {
	    return null;
	}
	TreeNode node = new TreeNode(pre[0]);
	for (int i = 0; i < in.length; i++) {
	    if (pre[0] == in[i]) {
		node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
		node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length),
			Arrays.copyOfRange(in, i + 1, in.length));
	    }
	}
	return node;
    }
}
