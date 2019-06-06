import java.util.ArrayList;
import java.util.Scanner;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

public class Test21 {
	public static void reOrderArray(int[] array) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				list1.add(array[i]);
			} else {
				list2.add(array[i]);
			}
		}
		list2.addAll(list1);
		for (int i = 0; i < list2.size(); i++) {
			array[i] = list2.get(i);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().split(" ");
		int[] arr = new int[str.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		reOrderArray(arr);
	}
}
