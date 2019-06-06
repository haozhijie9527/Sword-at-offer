/**
 * 删除链表重复节点
 * 
 * @author Administrator
 *
 */
public class Test18 {
	public ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null)
			return null;
		// 在头结点之前加一个节点用于指示头结点的位置
		ListNode newHead = new ListNode(pHead.val - 1);
		newHead.next = pHead;
		// 使用cur操作节点，last来存储连续相同节点前的最后一个节点，使其next指向相同节点后的第一个不同节点
		ListNode cur = pHead;
		ListNode last = newHead;
		while (cur != null && cur.next != null) {
			if (cur.val != cur.next.val) {
				last = cur;
			} else {
				while (cur.next != null && cur.val == cur.next.val)
					cur = cur.next;
				last.next = cur.next;
			}
			cur = cur.next;
		}
		return newHead.next;
	}
}
