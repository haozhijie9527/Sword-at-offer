import java.util.ArrayList;

public class Test57 {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		int small = 1, big = 2;
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		while (small < big) {
			int cur = (small + big) * (big - small + 1) / 2;
			if (cur == sum) {
				ArrayList<Integer> list = new ArrayList<>();
				for (int i = small; i <= big; i++) {
					list.add(i);
				}
				result.add(list);
				small++;
			} else if (cur < sum) {
				big++;
			} else {
				small++;
			}
		}
		return result;
	}
}
