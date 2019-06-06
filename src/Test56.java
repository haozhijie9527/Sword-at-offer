//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Test56 {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if (array.length == 0 || array.length < 2) {
			return;
		}
		int resultExclusiveOR = 0;
		for (int i = 0; i < array.length; i++) {
			resultExclusiveOR ^= array[i];
		}
		int indexOf1 = FindFirstBitIs1(resultExclusiveOR);
		num1[0] = 0;
		num2[0] = 0;
		for (int j = 0; j < array.length; j++) {
			if (IsBit1(array[j], indexOf1))
				num1[0] ^= array[j];
			else
				num2[0] ^= array[j];
		}
	}

	private boolean IsBit1(int num, int indexOf1) {
		num = num >> indexOf1;
		return (num & 1) == 1;
	}

	private int FindFirstBitIs1(int resultExclusiveOR) {
		int indexBit = 0;
		while (((resultExclusiveOR & 1) == 0) && (indexBit) < 8 * 4) {
			resultExclusiveOR = resultExclusiveOR >> 1;
			++indexBit;
		}
		return indexBit;
	}
}
