package AugastWrritenTest;

import java.util.Arrays;
import java.util.Scanner;

//19)Create a class project (projectId,projectName,Student sarr[]) .
//Each project has max 3 student .
//WAP to create and accept data in array of project and display 
//the projectwise student details(All fields in project class are private use gettters/setters).

class Project {
	private int projectId;
	private String projectName;
	private StudData[] student;

	int getProjectId() {
		return projectId;
	}

	void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	String getProjectName() {
		return projectName;
	}

	void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	StudData[] getstudent() {
		return student;
	}

	void setstudent(StudData[] student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "projectId=" + projectId + ", projectName=" + projectName + ", student=" + Arrays.toString(student);
	}
}

class StudData {
	private int rollno;
	private String name;
	public int totalMarks;

	int getRollno() {
		return rollno;
	}

	void setRollno(int rollno) {
		this.rollno = rollno;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "rollno=" + rollno + ", name=" + name;
	}
}

public class Problem19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Project[] projects = new Project[1];

		for (int i = 0; i < projects.length; i++) {
			Project p = new Project();
			StudData[] students = new StudData[3];

			System.out.println("Enter project id ..");
			int projectid = sc.nextInt();
			p.setProjectId(projectid);

			System.out.println("Enter project name ..");
			String projectName = sc.next();
			p.setProjectName(projectName);

			for (int j = 0; j < students.length; j++) {
				StudData s = new StudData();
				System.out.println("Enter student roll no :");
				int sid = sc.nextInt();
				s.setRollno(sid);

				System.out.println("Enter student name : ");
				String sName = sc.next();
				s.setName(sName);

				students[j] = s;
			}
			p.setstudent(students);
			projects[i] = p;
		}
		for (Project p1 : projects) {
			System.out.println("Project Id : " + p1.getProjectId());
			System.out.println("project name  : " + p1.getProjectName());
			System.out.println("students in Project : ");
			for (StudData s1 : p1.getstudent()) {
				System.out.println("students name  : " + s1.getName());
				System.out.println("students roll no : " + s1.getRollno());

			}
		}
	}
}
