package com.Dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Pojo.Library;

public class LibraryImplementetion implements LibraryCrud {

	Map<Integer, Library> al = new HashMap<Integer, Library>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void add(Library l) {
		al.put(l.id, l);
	}

	@Override
	public void remove() {
		System.out.println("Enter book id for delet book..");
		int b_id = sc.nextInt();
		if (al.containsKey(b_id)) {
			al.remove(b_id);
			System.out.println("Book Deleted SuccessFully...........");

		} else {
			System.err.println("Boook with this ID is not Present.......");
		}
	}
	

	@Override
	public void search() {
		System.out.println("Enter Book Title OR Author name to search : ");
		String cou = sc.next();

		Collection<Library> c = al.values();
		boolean f = false;
		for (Library s : c) {
			if (s.bookTitle.equals(cou) || s.author.equals(cou)) {
				System.out.println(s.id + " " + s.bookTitle + " " + s.author + " " + s.genre);
				f = true;
			}
		}
		if (!f) {
			System.err.println("Book with " + cou + " Genere Title or Author is not Present.......");
		}

	}

	@Override
	public Map<Integer, Library> show() {

		return al;
	}

	@Override
	public void showByGenere() {
		System.out.println("Enter Genre name to search : ");
		String cou = sc.next();

		Collection<Library> c = al.values();
		boolean f = false;
		for (Library s : c) {
			if (s.genre.equals(cou)) {
				System.out.println(s.id + " " + s.bookTitle + " " + s.author + " " + s.genre);
				f = true;
			}
		}
		if (!f) {
			System.err.println("Book with " + cou + " Genere Name is not Present.......");
		}
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		LibraryImplementetion l1 = new LibraryImplementetion();
		char contiu;

		do {
			System.out.println("Enter Your Choice:: ");
			System.out.println(
					"1:Add Book\n2:Show All Book \n3:Remove Book\n4:Search Book by Title or Author \n5:Search Book by genre ");
			int ch = sc1.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("enter Book Id");
				int id = sc1.nextInt();
				System.out.println("enter Book name");
				String name = sc1.next();
				System.out.println("enter Book author ");
				String aut = sc1.next();
				System.out.println("Enter Book genere ");
				String gen = sc1.next();
				l1.add(new Library(id, name, aut, gen));
				break;
			}
			case 2: {

				Map<Integer, Library> sMap = l1.show();
				if (sMap.size() > 0) {
					System.out.println(sMap);
				} else {
					System.err.println("No Book Added ...");
				}
				break;
			}
			case 3: {
				l1.remove();
				break;
			}

			case 4: {
				l1.search();
				break;
			}
			case 5: {
				l1.showByGenere();
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
