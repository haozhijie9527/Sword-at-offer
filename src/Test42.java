
public class Test42 {
	public int FindGreatestSumOfSubArray(int[] array) {
		if (array.length == 0)
			return 0;
		int maxSum = 0x8000000;//int的最小值
		int curSum = 0;
		for (int i = 0; i < array.length; i++) {
			if (curSum <= 0)
				curSum = array[i];
			else
				curSum += array[i];
			if (curSum > maxSum)
				maxSum = curSum;
		}
		return maxSum;
	}
}
