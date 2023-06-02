package AugastWrritenTest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//23)Create two Set of students objects where insertion order in maintained. Now accept 
//Studentid from user and check whether in both sets have student with given id at same position

class Students {
	int sId;

	public Students(int sId) {
		super();
		this.sId = sId;
	}

	@Override
	public String toString() {
		return "sId=" + sId;
	}

}

public class Problem23 {

	public static void main(String[] args) {

		Set<Students> s1 = new LinkedHashSet<Students>();
		s1.add(new Students(1));
		s1.add(new Students(2));
		s1.add(new Students(3));

		Set<Students> s2 = new LinkedHashSet<Students>();
		s2.add(new Students(4));
		s2.add(new Students(2));
		s2.add(new Students(3));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id :");
		int studid = sc.nextInt();

		boolean found = false;
		Iterator<Students> iterator1 = s1.iterator();
		Iterator<Students> iterator2 = s2.iterator();
		int position = 0;

		while (iterator1.hasNext() && iterator2.hasNext()) {
			Students stud1 = iterator1.next();
			Students stud2 = iterator2.next();
			position++;

			if (stud1.sId == studid && stud2.sId == studid) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Student with ID " + studid + " is found at position " + position + " in both sets.");
		} else {
			System.out.println("Student with ID " + studid + " is not found at the same position in both sets.");
		}
	}

}
