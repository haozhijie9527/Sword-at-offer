import java.util.ArrayList;
import java.util.Stack;

public class Test6 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<>();
		if (listNode == null)
			return list;
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}
}
