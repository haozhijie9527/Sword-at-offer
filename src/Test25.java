
public class Test25 {
	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode nHead = new ListNode(0);
		ListNode cur = nHead;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				cur.next = list1;
				list1 = list1.next;
			} else {
				cur.next=list2;
				list2 = list2.next;
			}
			cur = cur.next;
		}
		if (list1 != null) {
			cur.next = list1;
		} else {
			cur.next = list2;
		}
		return nHead.next;
	}
}
