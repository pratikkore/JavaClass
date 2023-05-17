package com.Dao;

import com.Pojo.NotFoundException;
import com.Pojo.Student;

public interface StudentCrud {
	void add(Student s);

	abstract void remove() throws NotFoundException;

	void search() throws NotFoundException;

	void update() throws NotFoundException;

	void show() throws NotFoundException;

	void showByCourse() throws NotFoundException;
}
