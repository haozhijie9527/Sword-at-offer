
public class Test39 {
    public int MorethanHalfNum(int[] array){
	if(array.length==0)
	    return 0;
	int result=array[0];
	int times=1;
	for (int i = 1; i < array.length; i++) {
		if (times == 0) {
			result = array[i];
			times = 1;
		} else if (array[i] == result) {
			times++;
		} else {
			times--;
		}
	}
	return result;
    }
	public int MoreThanHalfNum_Solution(int[] array) {
		if (array.length == 0)
			return 0;
		int result = array[0];
		int times = 1;
		for (int i = 1; i < array.length; i++) {
			if (times == 0) {
				result = array[i];
				times = 1;
			} else if (array[i] == result) {
				times++;
			} else {
				times--;
			}
		}
		int time = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == result)
				time++;
		}
		if (time * 2 <= array.length) {
			System.out.println(time);
			return 0;
		} else {
			return result;
		}
	}
}
