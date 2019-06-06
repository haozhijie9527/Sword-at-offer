/**
 * 编程之美上给出的规律：
 * 1.如果第i位（自右至左，从1开始标号）上的数字为0，则第i位可能出现1的次数由更高位决定（若没有高位，视高位为0），等于更高位数字X当前位数的权重10i-1。
 * 2.如果第i位上的数字为1，则第i位上可能出现1的次数不仅受更高位影响，还受低位影响（若没有低位，视低位为0），等于更高位数字X当前位数的权重10i-1+（低位数字+1）。
 * 3.如果第i位上的数字大于1，则第i位上可能出现1的次数仅由更高位决定（若没有高位，视高位为0），等于（更高位数字+1）X当前位数的权重10i-1
 * 
 * 总结一下以上的算法，可以看到，当计算右数第 i 位包含的 X 的个数时：
 * 取第 i 位左边（高位）的数字，乘以 10 i−1 ，得到基础值 a 。 取第 i 位数字，计算修正值： 如果大于 X，则结果为 a+ 10 i−1 。
 * 如果小于 X，则结果为 a 。 如果等 X，则取第 i 位右边（低位）数字，设为 b ，最后结果为 a+b+1 。
 * 
 * @author Administrator
 *
 */
public class Test43 {
	public int NumberOf1Between1AndN_Solution(int n) {
		if (n < 0)
			return 0;
		int high, low, curr, tmp, i = 1;
		high = n;
		int total = 0;
		while (high != 0) {
			high = n / (int) Math.pow(10, i);// 获取第i位的高位
			tmp = n % (int) Math.pow(10, i);
			curr = tmp / (int) Math.pow(10, i - 1);// 获取第i位
			low = tmp % (int) Math.pow(10, i - 1);// 获取第i位的低位
			if (curr == 1) {
				total += high * (int) Math.pow(10, i - 1) + low + 1;
			} else if (curr < 1) {
				total += high * (int) Math.pow(10, i - 1);
			} else {
				total += (high + 1) * (int) Math.pow(10, i - 1);
			}
			i++;
		}
		return total;
	}
}
