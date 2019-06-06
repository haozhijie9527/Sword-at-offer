import java.util.ArrayList;
import java.util.Collections;

public class Test38 {
    public static void main(String[] args) {
	String s="14";
	ArrayList<String> arr= Permutation(s);
	for (String string : arr) {
	    System.out.println(string);
	}
    }
    
    public static ArrayList<String> Permutation(String str) {
	ArrayList<String> result = new ArrayList<>();
	if (str == null) {
	    return result;
	}
	PermutationHelper(str.toCharArray(), 0, result);
	Collections.sort(result);
	return result;
    }

    private static void PermutationHelper(char[] Array, int begin, ArrayList<String> result) {
	if (begin == Array.length - 1) {
	    if (!result.contains(new String(Array)))
		result.add(new String(Array));
	} else {
	    for (int i = begin; i < Array.length; i++) {
		swap(Array, begin, i);
		PermutationHelper(Array, begin + 1, result);
		swap(Array, begin, i);
	    }

	}
    }

    private static void swap(char[] array, int begin, int i) {
	char temp = array[begin];
	array[begin] = array[i];
	array[i] = temp;
    }
}