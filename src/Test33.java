
public class Test33 {
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length==0)
			return false;
		if (sequence.length == 1)
			return true;
		return VerifySquenceOfBST(sequence, 0, sequence.length - 1);
	}

	private boolean VerifySquenceOfBST(int[] sequence, int lo, int hi) {
        if(lo >= hi){
            return true;
        }
        int root = sequence[hi];
		int i = lo;
		while (sequence[i] < root) {
			i++;
		}
		for (int j = i; j < hi; j++) {
			if (sequence[j] < root) {
				return false;
			}
		}
		return VerifySquenceOfBST(sequence, 0, i-1) && VerifySquenceOfBST(sequence, i, hi-1);
	}
}
