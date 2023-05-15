package com.Dao;

import java.util.Map;

import com.Pojo.Library;

public interface LibraryCrud {
	void add(Library l);

	abstract void remove();

	void search();

	Map<Integer, Library> show();

	void showByGenere();

}
