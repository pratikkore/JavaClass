package KhadijaMamAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Accept string from user. Create a map which has key as character in
//string and value as number of occurances of that character in string. E.g.
//given string is “pizzapan” map will be <p,2>,<i , 1>,<z, 2>,<a,2>,<n,1>

public class OccuranceInMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user String : ");
		String user = sc.next();

		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < user.length(); i++) {
			if (m.containsKey(user.charAt(i))) {

				Integer count = m.get(user.charAt(i));
				m.put(user.charAt(i), count + 1);
			} else {
				m.put(user.charAt(i), 1);
			}
		}
		System.out.println(m);
	}

}
