
public class Test4 {
	public static boolean Find(int target, int[][] array) {
		int rows = array.length;
		int cols = array[0].length;
		int i = 0, j = cols - 1;
		while (i < rows && j >= 0) {
			if (target < array[i][j])
				j--;
			else if (target > array[i][j])
				i++;
			else
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		System.out.println(Find(15, array));
	}
}
