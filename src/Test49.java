import java.util.ArrayList;

public class Test49 {
	public int GetUglyNumber_Solution(int index) {
		if (index <= 0)
			return 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		int i2 = 0, i3 = 0, i5 = 0;
		for (int i = 1; i < index; i++) {
			list.add(Math.min(Math.min(list.get(i2) * 2, list.get(i3) * 3), list.get(i5) * 5));
			if (list.get(i) == list.get(i2) * 2)
				i2++;
			if (list.get(i) == list.get(i3) * 3)
				i3++;
			if (list.get(i) == list.get(i5) * 5)
				i5++;
		}
		return list.get(list.size() - 1);
	}
}
