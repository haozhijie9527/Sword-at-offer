import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Test59 {
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<>();
		if (num == null)
			return list;
		if (size > num.length || size < 1)
			return list;
		Deque<Integer> queue = new LinkedList<>();
		//��֤˫������ж�ͷ������ֵ�ǵ�ǰ���ڵ����ֵ
		for (int i = 0; i < size; i++) {
			while (!queue.isEmpty() && num[i] > num[queue.getLast()]) {
				queue.removeLast();
			}
			queue.addLast(i);
		}
		
		for (int i = size - 1; i < num.length; i++) {
			while (!queue.isEmpty() && num[i] > num[queue.getLast()]) {
				queue.removeLast();
			}
			queue.addLast(i);
			if (i - queue.getFirst() + 1 > size) {
				queue.removeFirst();
			}
			list.add(num[queue.getFirst()]);
		}
		return list;
	}
}
