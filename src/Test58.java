/**
 * 
 * ×Ö·û´®Ñ­»·×óÒÆ
 * @author Administrator
 *
 */
public class Test58 {
	public String LeftRotateString(String str, int n) {
		int len = str.length();
		if (len == 0)
			return null;
		n = n % len;
		str+=str;
		return str.substring(n, len+n);
	}
}
