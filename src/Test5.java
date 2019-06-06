
public class Test5 {
	public String replaceSpace(StringBuffer str) {
		StringBuffer newstr = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				newstr.append(str.charAt(i));
			else
				newstr.append("%20");
		}
		return newstr.toString();
	}
}
