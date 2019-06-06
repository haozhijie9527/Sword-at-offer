/**
 * ÇàÍÜÌøÌ¨½×
 * 
 * @author Administrator
 *
 */
public class Test10_1 {
	public int JumpFloor(int target) {
		if (target == 1)
			return 1;
		if (target == 2)
			return 2;
		int way1 = 1;
		int way2 = 2;
		int way = 0;
		for (int i = 3; i <= target; i++) {
			way = way1 + way2;
			way1 = way2;
			way2 = way;
		}
		return way;

	}
}
