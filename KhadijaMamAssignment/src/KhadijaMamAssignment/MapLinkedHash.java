package KhadijaMamAssignment;

import java.util.LinkedHashMap;

//1. Create a Linkedhashmap<int,String> where key is integers 1 to 10 and
//string is number in words.Remove entry for which number is divisible by 3

public class MapLinkedHash {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
		lm.put(1, "one");
		lm.put(2, "two");
		lm.put(3, "three");
		lm.put(4, "four");
		lm.put(5, "five");
		lm.put(6, "six");
		lm.put(7, "seven");
		lm.put(8, "eight");
		lm.put(9, "nine");
		lm.put(10, "ten");

		lm.entrySet().removeIf(entry -> entry.getKey() % 3 == 0);

		System.out.println(lm);
	}

}
