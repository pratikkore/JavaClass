package com.Pojo;

import java.util.ArrayList;

public class Student {
	public int id;
	public String name;
	public ArrayList<Course> course = new ArrayList<>();

	public Student(int id, String name, ArrayList<Course> course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", course=" + course + "]";
	}

}
