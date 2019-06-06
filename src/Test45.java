
public class Test45 {
	public String PrintMinNumber(int[] numbers) {
		String str = "";
		if (numbers.length == 0)
			return str;
		if (numbers.length == 1)
			return Integer.toString(numbers[0]);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (less(numbers[j], numbers[i])) {
					int t = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = t;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			str += String.valueOf(numbers[i]);
		}
		return str;
	}

	public static boolean less(int a, int b) {
		int r1 = Integer.valueOf(a + "" + b);
		int r2 = Integer.valueOf(b + "" + a);
		if (r1 < r2)
			return true;
		else
			return false;
	}
}
