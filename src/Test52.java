
public class Test52 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int len1 = 0, len2 = 0;
		ListNode cur1 = pHead1;
		ListNode cur2 = pHead2;
		while (cur1 != null) {
			cur1 = cur1.next;
			len1++;
		}
		while (cur2 != null) {
			cur2 = cur2.next;
			len2++;
		}
		int dis = len1 - len2;
		ListNode lNode = pHead1;
		ListNode sNode = pHead2;

		if (len1 - len2 < 0) {
			lNode = pHead2;
			sNode = pHead1;
			dis = len2 - len1;
		}
		for (int i = 0; i < dis; i++) {
			lNode = lNode.next;
		}
		while (sNode != null && lNode != null && lNode != sNode) {
			lNode = lNode.next;
			sNode = sNode.next;
		}
		ListNode fNode = lNode;
		return fNode;
	}
}
