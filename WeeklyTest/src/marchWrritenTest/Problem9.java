package marchWrritenTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//WAP to print the word frequency using map
//Input: “Nothing is as easy as it looks Nothing” then 
//Output: {Nothing=2, is=1, as=2, easy=1, it=1, looks=1} 

public class Problem9 {

	public static void main(String[] args) {

		String str = "Nothing is as easy as it looks Nothing";

		String[] spl = str.trim().split(" ");

		System.out.println(Arrays.toString(spl));

		Map<String, Integer> hs = new HashMap();

		for (String w : spl) {
			String lowercaseWord = w.toLowerCase();
			int frequency = hs.getOrDefault(lowercaseWord, 0);
			hs.put(lowercaseWord, frequency + 1);
		}
		for (Map.Entry<String, Integer> entry : hs.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
