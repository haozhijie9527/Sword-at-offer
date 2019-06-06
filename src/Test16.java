
public class Test16 {
	public double Power(double base, int exponent) {
		int n = Math.abs(exponent);
		if (base == 0)
			return 0;
		if (exponent == 0)
			return 1;
		double result = Power(base, n >> 1);
		result *= result;
		if ((n & 1) == 1)
			result *= base;
		if (exponent < 0)
			result = 1 / result;
		return result;
	}
}
