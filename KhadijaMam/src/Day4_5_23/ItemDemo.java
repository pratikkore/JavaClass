package Day4_5_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Item implements Comparable<Item> {
	int id;
	String name;
	float price;

	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price;
	}

	@Override
	public int compareTo(Item i1) {

		return (int) (this.price - i1.price);
	}

}

class Item2 implements Comparator<Item> {
	@Override
	public int compare(Item o1, Item o2) {

		if (o1.price == o2.price) {
			return o1.name.compareTo(o2.name);
		} else {
			return (int) (o1.price - o2.price);
		}
	}

}

public class ItemDemo {

	public static void main(String[] args) {

		ArrayList<Item> e = new ArrayList<Item>();
		e.add(new Item(1, "soap", 40));
		e.add(new Item(2, "milk", 40));
		e.add(new Item(3, "oil", 100));

		Collections.sort(e);
		for (Item i : e) {
			System.out.println(i);
		}
		System.out.println("****************************************************");
		Collections.sort(e, new Item2());
		for (Item i : e) {
			System.out.println(i);
		}
	}

}
