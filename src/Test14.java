import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); String[] first =
		 * input.nextLine().split(" "); String[] array =
		 * input.nextLine().split(" "); int n = Integer.parseInt(first[0]); int
		 * m = Integer.parseInt(first[1]);
		 */
		int n = 11, m = 5;
		int minCount = 12;
		int[] array = { 2, 4, 3, 1, 3, 2, 4, 1, 0, 4, 4 };
		int count;
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> list = null;
		for (int i = 0; i < n - m; i++) {
			count = 0;
			for (int j = i; j < n && set.size() < m; j++) {
				if (array[j] != 0) {
					set.add(array[j]);
				}
				count++;
			}
			System.out.println("\n");
			if (count < minCount && set.size() == m) {
				minCount = count;
			}
			set.clear();
		}
		System.out.println(minCount);
	}
}
