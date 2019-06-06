/**
 * ¾ØĞÎ¸²¸ÇÎÊÌâ
 * @author Administrator
 *
 */
public class Test10_3 {
	public int RectCover(int target) {
		if (target < 1)
			return 0;
		else if (target == 1 || target == 2)
			return target;
		else
			return RectCover(target - 1) + RectCover(target - 2);
	}
}
