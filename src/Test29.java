import java.util.ArrayList;

public class Test29 {
	static ArrayList<Integer> result = new ArrayList<>();

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printMatrix(matrix);
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}

	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		if (matrix == null)
			return null;
		ArrayList<Integer> list = new ArrayList<>();
		int a = 0, b = 0, c = matrix.length - 1, d = matrix[0].length - 1;
		while (a <= c && b <= d) {
			printEdge(matrix, a++, b++, c--, d--);
		}
		return result;
	}

	private static void printEdge(int[][] matrix, int a, int b, int c, int d) {
		if (a == c) {
			for (int i = b; i <= d; i++) {
				result.add(matrix[a][i]);
			}
		} else if (b == d) {
			for (int i = a; i <= c; i++) {
				result.add(matrix[i][b]);
			}
		} else {
			int curX = a;
			int curY = b;
			// 上横行
			while (curY != d) {
				result.add(matrix[a][curY]);
				curY++;
			}
			// 右竖行
			while (curX != c) {
				result.add(matrix[curX][d]);
				curX++;
			}
			// 下横行
			while (curY != b) {
				result.add(matrix[c][curY]);
				curY--;
			}
			// 左竖行
			while (curX != a) {
				result.add(matrix[curX][b]);
				curX--;
			}

		}
	}
}
