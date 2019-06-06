
public class Test22 {
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k == 0)
			return null;
		int size = 0;
		ListNode cur = head;
		ListNode quick = head;
		ListNode slow = head;
		while (cur != null) {
			size++;
			cur = cur.next;
		}
		if (k > size)
			return null;
		for (int i = 0; i < k; i++) {
			quick = quick.next;
		}
		while (quick.next != null) {
			slow = slow.next;
			quick = quick.next;
		}
		return slow.next;
	}
}
