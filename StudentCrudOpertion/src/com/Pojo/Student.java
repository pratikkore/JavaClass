package com.Pojo;

public class Student {
	public int id;
	public String name;
	public String courseName;

	public Student(int id, String name, String courseName) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", courseName=" + courseName + "]";
	}

}
