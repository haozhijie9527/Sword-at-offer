/**
 * ÇàÍÜÌøÌ¨½×±äÌ¬°æ
 * @author Administrator
 *
 */
public class Test10_2 {
	public int JumpFloorII(int target) {
		if(target<=0)
			return -1;
		else if(target==1)
			return 1;
		else
			return 2 * JumpFloorII(target-1);
	}
}
