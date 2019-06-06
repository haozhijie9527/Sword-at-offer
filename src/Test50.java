import java.util.HashMap;

public class Test50 {
	public int FirstNotRepeatingChar(String str) {
		if (str.length() == 0)
			return -1;
		if (str.length() == 1)
			return Integer.valueOf(str);
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int time = map.get(str.charAt(i));
				map.put(str.charAt(i), ++time);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
}
