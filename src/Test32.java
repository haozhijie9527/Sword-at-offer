import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test32 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
	if (pRoot == null)
	    return new ArrayList<>();
	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	Queue<TreeNode> list = new LinkedList<>();
	ArrayList<Integer> layer = new ArrayList<>();
	TreeNode cur;
	int numOfNext = 0;
	int isBePrinted = 1;
	list.add(pRoot);
	while (!list.isEmpty()) {
	    layer.add(list.peek().val);
	    cur = list.peek();
	    if (cur.left != null) {
		list.add(cur.left);
		numOfNext++;
	    }
	    if (cur.right != null) {
		list.add(cur.right);
		numOfNext++;
	    }
	    list.poll();
	    --isBePrinted;
	    if (isBePrinted == 0) {
		result.add(layer);
		layer = new ArrayList<>();
		isBePrinted = numOfNext;
		numOfNext = 0;
	    }
	}
	return result;

    }

    // 递归方法实现
    /*
     * ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
     * ArrayList<ArrayList<Integer>> list = new ArrayList<>(); depth(pRoot, 1,
     * list); return list; } private void depth(TreeNode root, int depth,
     * ArrayList<ArrayList<Integer>> list) { if (root == null) return; if (depth
     * > list.size()) list.add(new ArrayList<Integer>()); list.get(depth -
     * 1).add(root.val);
     * 
     * depth(root.left, depth + 1, list); depth(root.right, depth + 1, list); }
     */
}
