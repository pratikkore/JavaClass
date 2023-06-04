package marchWrritenTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//20)There is a linked list which contains numbers from 1 to 5 . { 1,4,2,1,3,1,4} . 
//Create a map which contains string which is number in words and number of times that number has appeared in list. 
//E.g. output map for above list will be map { (“one”,3) , (“two”,1),(“three” , 1),(“four”,2)}. 
//Make use of switch statement to get number in words.

public class Problem20 {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(1);
		ls.add(4);
		ls.add(2);
		ls.add(1);
		ls.add(3);
		ls.add(1);
		ls.add(4);

		Map<String, Integer> m = new HashMap<String, Integer>();

		for (Integer num : ls) {
			String numWord = getWord(num);
			m.put(numWord, m.getOrDefault(numWord, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
		}
	}

	public static String getWord(int num) {
		String numberWord;
		switch (num) {
		case 1:
			numberWord = "one";
			break;
		case 2:
			numberWord = "two";
			break;
		case 3:
			numberWord = "three";
			break;
		case 4:
			numberWord = "four";
			break;
		case 5:
			numberWord = "five";
			break;
		default:
			numberWord = "unknown";
			break;
		}
		return numberWord;
	}
}