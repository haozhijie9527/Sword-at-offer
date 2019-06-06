
public class Test13 {
	public int movingCount(int threshold, int rows, int cols) {
		if (threshold < 0 || rows <= 0 || cols < 0)
			return 0;
		int flag[][] = new int[rows][cols]; // 记录是否已经走过
		return helper(0, 0, rows, cols, flag, threshold);
	}

	private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
		if (i < 0 || i >= rows || j < 0 || j >= cols || isDigitSum(i) + isDigitSum(j) > threshold || flag[i][j] == 1)
			return 0;
		flag[i][j] = 1;
		return helper(i - 1, j, rows, cols, flag, threshold) + helper(i + 1, j, rows, cols, flag, threshold)
				+ helper(i, j - 1, rows, cols, flag, threshold) + helper(i, j + 1, rows, cols, flag, threshold) + 1;
	}

	private int isDigitSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
}
