import java.util.ArrayList; 

public class Test40 {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		if (input.length == 0 || k <= 0 || k > input.length)
			return list;
		// 构建大顶堆
		for (int i = k / 2 - 1; i >= 0; i--) {
			adjustHeap(input, i, k);
		}
		// 调整堆结构
		int tmp;
		for (int i = k; i < input.length; i++) {
			if (input[0] > input[i]) {
				tmp = input[0];
				input[0] = input[i];
				input[i] = tmp;
				adjustHeap(input, 0, k);
			}
		}
		for (int j = 0; j < k; j++) {
			list.add(input[j]);
		}
		return list;
	}

	// 调整堆结构
	private static void adjustHeap(int[] arr, int i, int length) {
		int temp = arr[i];
		for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
			if (k + 1 < length && arr[k] < arr[k + 1]) {
				k++;
			}
			if (temp < arr[k]) {
				arr[i] = arr[k];
				i = k;
			} else {
				break;
			}
		}
		arr[i] = temp;
	}

	
	public static void main(String[] args) {
		int[] arr = {4,5,1,6,2,7,2,8};
		ArrayList<Integer> list = GetLeastNumbers_Solution(arr, 2);
		for (Integer integer : list) {
			System.out.print(integer);
		}
	}
}
