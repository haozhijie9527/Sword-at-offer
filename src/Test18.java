/**
 * ɾ�������ظ��ڵ�
 * 
 * @author Administrator
 *
 */
public class Test18 {
	public ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null)
			return null;
		// ��ͷ���֮ǰ��һ���ڵ�����ָʾͷ����λ��
		ListNode newHead = new ListNode(pHead.val - 1);
		newHead.next = pHead;
		// ʹ��cur�����ڵ㣬last���洢������ͬ�ڵ�ǰ�����һ���ڵ㣬ʹ��nextָ����ͬ�ڵ��ĵ�һ����ͬ�ڵ�
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
