import java.util.ArrayList;
import java.util.Scanner;

//����һ���������飬ʵ��һ�����������������������ֵ�˳��
//ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣

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
