package com.Dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Pojo.Course;
import com.Pojo.NotFoundException;
import com.Pojo.Student;

public class StudentImplementetion implements StudentCrud {

	Map<Integer, Student> al = new HashMap<Integer, Student>();

	Scanner sc = new Scanner(System.in);

	StudentImplementetion() {
		al.put(1, new Student(1, "Pratik",
				new ArrayList<Course>(Arrays.asList(new Course(101, "java"), new Course(102, "html")))));
		al.put(2, new Student(2, "ravi", new ArrayList<Course>(Arrays.asList(new Course(103, "angular")))));
		al.put(3, new Student(3, "kiran", new ArrayList<Course>(Arrays.asList(new Course(101, "java")))));
		al.put(4, new Student(4, "vicky", new ArrayList<Course>(Arrays.asList(new Course(104, "javascipt")))));
		al.put(5, new Student(5, "himanshu", new ArrayList<Course>(Arrays.asList(new Course(103, "angular")))));
	}

	@Override
	public void add(Student s) {
		al.put(s.id, s);
	}

	@Override
	public void remove() throws NotFoundException {
		System.out.println("Enter Student ID For Remove : ");
		int s_id = sc.nextInt();
		if (al.containsKey(s_id)) {
			al.remove(s_id);
			System.out.println("Student Deleted SuccessFully...........");
		} else {
			throw new NotFoundException("Student with this ID is not Present.......");
		}
	}

	@Override
	public void search() throws NotFoundException {
		System.out.println("Enter Student name to search : ");
		String s_name = sc.next();
		boolean f = false;
		Collection<Student> ar = al.values();
		for (Student s : ar) {
			if (s.name.equalsIgnoreCase(s_name)) {
				System.out.println(s.id + " " + s_name);
				System.out.println(s.name + " is having following coures..");
				for (Course c : s.course) {
					System.out.println(c.courseName);
				}
				f = true;
			}
		}
		if (!f) {
			throw new NotFoundException("Student with " + s_name + " Name is not Present.......");
//			System.err.println("Student with " + s_name + " Name is not Present.......");
		}
	}

	@Override
	public void update() throws NotFoundException {

		System.out.println("Enter Student id you want to update");
		int s_id = sc.nextInt();
		if (al.containsKey(s_id)) {
			System.out.println("enter name to update");
			String name = sc.next();
			ArrayList<Course> course = new ArrayList<>();
			char enterMoreCourse;
			do {
				System.out.println("Enter course Id");
				int courseId = sc.nextInt();
				boolean f = false;
				for (Course c : course) {
					if (c.courseId == courseId) {
						f = true;
						break;
					}
				}
				if (!f) {
					System.out.println("Enter course Name ");
					String courseName = sc.next();
					course.add(new Course(courseId, courseName));
				} else {
					System.err.println("Course with id " + courseId + " is already Added");
				}
				System.out.println("Enter y|Y to another Course");
				enterMoreCourse = sc.next().charAt(0);
			} while (enterMoreCourse == 'y' || enterMoreCourse == 'Y');
			Student student = new Student(s_id, name, course);
			al.replace(s_id, student);
		} else {
			throw new NotFoundException("Student with this ID is not Present.......");
		}
	}

	@Override
	public void show() throws NotFoundException {
		if (al.size() > 0) {
			for (Map.Entry<Integer, Student> s : al.entrySet()) {
				Student stud = s.getValue();
				System.out.println("Student ID -" + s.getKey() + " " + " Student name - " + stud.name);
				System.out.println(stud.name + " is having following Courses ...");
				for (Course c : stud.course) {
					System.out.println(c.courseName);
				}
				System.out.println("***********************************************");
			}
		} else {
			throw new NotFoundException("Don't have any student to show ..");
		}
	}

	@Override
	public void showByCourse() throws NotFoundException {
		Collection<Student> c = al.values();
		boolean f = false;
		System.out.println("Enter Course Name");
		String cName = sc.next();
		for (Student s : c) {
			for (Course c1 : s.course) {
				if (c1.courseName.equalsIgnoreCase(cName)) {
					System.out.println(s.name);
					f = true;
				}
			}
		}
		if (!f) {
			throw new NotFoundException(cName + " Course is not assigned with any Student.");
		}
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		StudentImplementetion studentImplementetion = new StudentImplementetion();

		char contiu;
		System.out.println(".... Welcome to Student managment system ....\n");
		do {

			System.out.println("Enter Your Choice to perform opertion : \n");
			System.out.println(
					"1:Add Student\n2:Show Student\n3:Remove Student\n4:Update Student\n5:Search Student by Name\n6:Search Student by Course ");
			int ch = sc1.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("enter Id");
				int id = sc1.nextInt();
				System.out.println("enter name");
				String name = sc1.next();

				ArrayList<Course> course = new ArrayList<>();
				char enterMoreCourse;
				do {
					System.out.println("Enter course Id");
					int courseId = sc1.nextInt();
					boolean f = false;
					for (Course c : course) {
						if (c.courseId == courseId) {
							f = true;
							break;
						}
					}
					if (!f) {
						System.out.println("Enter course Name ");
						String courseName = sc1.next();
						course.add(new Course(courseId, courseName));
					} else {
						System.err.println("Course with id " + courseId + " is already Added");
					}

					System.out.println("Enter Y|y for adding another Courses");
					enterMoreCourse = sc1.next().charAt(0);

				} while (enterMoreCourse == 'y' || enterMoreCourse == 'Y');

				studentImplementetion.add(new Student(id, name, course));
				break;
			}
			case 2: {
				try {
					studentImplementetion.show();
				} catch (NotFoundException e) {
					System.err.println(e);
				}
				break;
			}
			case 3: {
				try {
					studentImplementetion.remove();
				} catch (NotFoundException e) {
					System.err.println(e);
				}
				break;
			}
			case 4: {
				try {
					studentImplementetion.update();
				} catch (Exception e) {
					System.err.println(e);
				}
				break;
			}
			case 5: {
				try {
					studentImplementetion.search();

				} catch (Exception e) {
					System.err.println(e);
				}
				break;
			}
			case 6: {
				try {
					studentImplementetion.showByCourse();

				} catch (Exception e) {
					System.err.println(e);
				}
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