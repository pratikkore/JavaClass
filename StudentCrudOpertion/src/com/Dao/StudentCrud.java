package com.Dao;

import java.util.Map;

import com.Pojo.Student;

public interface StudentCrud {
	void add(Student s);

	abstract void remove();

	void search();

	void update();

	Map<Integer, Student> show();

	void showByCourse();
}
