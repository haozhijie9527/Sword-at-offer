import java.util.ArrayList;

public class Test57_1 {

	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<>();
		if (array == null || array.length < 2) {
			return list;
		}
		int i = 0, j = array.length - 1;
		while (i < j) {
			if ((array[i] + array[j]) < sum) {
				i++;
			} else if ((array[i] + array[j]) > sum) {
				j--;
			} else {
				list.add(array[i]);
				list.add(array[j]);
				return list;
			}
		}
		return list;
	}
}
