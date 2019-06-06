public class Test3 {
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		if (numbers == null || length <= 0) {
			return false;
		}
		int temp;
		for (int i = 0; i < length; i++) {
			while (numbers[i] != i) {
				int j = numbers[i];
				if (numbers[i] == numbers[j]) {
					duplication[0] = numbers[i];
					return true;
				}
				temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}
		return false;
	}
}


