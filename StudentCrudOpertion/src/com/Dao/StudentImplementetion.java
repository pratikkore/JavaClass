package com.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Pojo.Student;

public class StudentImplementetion implements StudentCrud {

	Map<Integer, Student> al = new HashMap<Integer, Student>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void add(Student s) {
		al.put(s.id, s);
	}

	@Override
	public void remove() {
		System.out.println("Enter Student id For Remove : ");
		int s_id = sc.nextInt();
//		boolean flag = false;
//		Set<Integer> it = al.keySet();
		if (al.containsKey(s_id)) {
			al.remove(s_id);
			System.out.println("Student Deleted SuccessFully...........");
		} else {
			System.err.println("Student with this ID is not Present.......");

		}
	}

	@Override
	public void search() {
		System.out.println("Enter Student name to search : ");
		String s_name = sc.next();
		boolean f = false;

		Collection<Student> ar = al.values();

		for (Student s : ar) {
			if (s.name.equals(s_name)) {
				System.out.println(s.id + " " + s_name + " " + s.courseName);
				f = true;
			}
		}
		if (!f) {
			System.err.println("Student with " + s_name + " Name is not Present.......");

		}

	}

	@Override
	public void update() {

		System.out.println("Enter Student id you want to update");
		int s_id = sc.nextInt();
		if (al.containsKey(s_id)) {
			System.out.println("enter name to update");
			String name = sc.next();
			System.out.println("enter course to update");
			String course = sc.next();
			Student student = new Student(s_id, name, course);

			al.replace(s_id, student);
		} else {
			System.err.println("Student with this ID is not Present.......");

		}

	}

	@Override
	public Map<Integer, Student> show() {
		return al;
	}

	@Override
	public void showByCourse() {

		System.out.println("Enter course name to search : ");
		String cou = sc.next();

		Collection<Student> c = al.values();
		boolean f = false;
		for (Student s : c) {
			if (s.courseName.equals(cou)) {
				System.out.println(s.id + " " + s.name + " " + s.courseName);
				f = true;
			}
		}
		if (!f) {
			System.err.println("Student with " + cou + " Course Name is not Present.......");
		}
	}

	public static void main(String[] args) {
//		List<Student> al = new ArrayList<Student>();
		Scanner sc1 = new Scanner(System.in);
		StudentImplementetion studentImplementetion = new StudentImplementetion();
		char contiu;

		do {
			System.out.println("Enter Your Choice:: ");
			System.out.println(
					"1:Add Student\n2:Show Student\n3:Remove Student\n4:Update Student\n5:Search Student\n6:Search Student by Course ");
			int ch = sc1.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("enter Id");
				int id = sc1.nextInt();
				System.out.println("enter name");
				String name = sc1.next();
				System.out.println("enter course");
				String course = sc1.next();
				studentImplementetion.add(new Student(id, name, course));
				break;
			}
			case 2: {
				System.out.println(studentImplementetion.show());
				break;
			}
			case 3: {
				studentImplementetion.remove();
				break;
			}
			case 4: {
				studentImplementetion.update();
				break;
			}
			case 5: {
				studentImplementetion.search();
				break;
			}
			case 6: {
				studentImplementetion.showByCourse();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
			System.out.println("Enter Y/y if you want to continue next opertion ..............");
			contiu = sc1.next().charAt(0);

		} while (contiu == 'Y' || contiu == 'y');
	}
}
