
public class Test53 {
	public int GetNumberOfK(int[] array, int k) {
		int len = array.length;
		if (len == 0)
			return 0;
		int i = getFirstK(array, k, 0, array.length - 1);
		int j = getLastK(array, k, 0, array.length - 1);

		if (i != -1 && j != -1) {
			return j - i + 1;
		}
		return 0;
	}

	private int getFirstK(int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int midIndex = (start + end) >> 1;
		int midData = array[midIndex];
		if (midData == k) {
			if (midIndex >= 1 && array[midIndex - 1] == k)
				end = midIndex - 1;
			else
				return midIndex;
		} else if (midData > k)
			end = midIndex - 1;
		else
			start = midIndex + 1;
		return getFirstK(array, k, start, end);
	}

	// Ñ­»·Ğ´·¨
	private int getLastK(int[] array, int k, int start, int end) {
		int length = array.length;
		int mid = (start + end) >> 1;
		while (start <= end) {
			int midIndex = (start + end) >> 1;
			int midData = array[midIndex];
			if (midData == k) {
				if (mid + 1 < length && array[mid + 1] == k) {
					start = mid + 1;
				} else {
					return mid;
				}
			} else if (array[mid] > k) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) >> 1;
		}
		return -1;
	}

}