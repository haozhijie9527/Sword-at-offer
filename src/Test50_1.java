import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Test50_1 {
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
	public void Insert(char ch) {
		if (map.containsKey(ch))
			map.put(ch, map.get(ch) + 1);
		else
			map.put(ch, 1);
		
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}
		return '#';
	}
}
