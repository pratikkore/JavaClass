package KhadijaMamAssignment;

//Create a Linkedhashmap which contains Emp is keys and Emp id is
//values.

import java.util.LinkedHashMap;

public class EmployeeLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> emp = new LinkedHashMap<>();
		emp.put("abc", 101);
		emp.put("Xyz", 102);
		emp.put("pqr", 103);

		System.out.println(emp);
	}

}
