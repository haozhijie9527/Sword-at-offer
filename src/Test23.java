/**
 * 寻找入环节点
 * @author Administrator
 *
 */

public class Test23 {
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null)
			return null;
		ListNode meetNode = findNode(pHead);
		if (meetNode == null)
			return null;
		ListNode slow = pHead;
		ListNode quick = meetNode;
		while (quick != slow) {
			quick = quick.next;
			slow = slow.next;
		}
		return slow;
	}

	private ListNode findNode(ListNode head) {
		ListNode slow = head, quick = head;
		while (quick != null && quick.next != null) {
			quick = quick.next.next;
			slow = slow.next;
			if (slow == quick)
				return slow;
		}
		return null;
	}

}
