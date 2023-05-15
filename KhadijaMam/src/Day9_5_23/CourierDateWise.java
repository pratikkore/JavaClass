package Day9_5_23;

import java.util.ArrayList;
import java.util.Collections;

class Customer implements Comparable<Customer> {
	int c_id;
	String c_name;
	String c_city;
	Order o;

	public Customer(int c_id, String c_name, String c_city, Order o) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_city = c_city;
		this.o = o;
	}

	@Override
	public String toString() {
		return "c_id=" + c_id + ", c_name=" + c_name + ", c_city=" + " " + c_city + " " + o;
	}

	@Override
	public int compareTo(Customer a) {
		return this.o.o_date.compareTo(a.o.o_date);
	}
}

class Order {
	int o_id;
	String o_date;
	String o_courier;

	public Order(int o_id, String o_date, String o_courier) {
		super();
		this.o_id = o_id;
		this.o_date = o_date;
		this.o_courier = o_courier;
	}

	@Override
	public String toString() {
		return "o_id=" + o_id + ", o_date=" + o_date + ", o_courier=" + o_courier;
	}

}

public class CourierDateWise {

	public static void main(String[] args) {

		ArrayList<Customer> al = new ArrayList();
		al.add(new Customer(1, "Mr.A", "Pune", new Order(101, "2000-09-01", "Ekart")));
		al.add(new Customer(2, "Mr.B", "Delhi", new Order(102, "2005-12-01", "dhelivery")));
		al.add(new Customer(3, "Mr.C", "Mumbai", new Order(103, "2023-01-01", "BlueDart")));
		al.add(new Customer(4, "Mr.D", "chennai", new Order(104, "2002-05-01", "Dtdc")));

		for (Customer c : al) {
			System.out.println(c);
		}

		Collections.sort(al);
		System.out.println("*******************************************************************************");
		for (Customer c : al) {
			System.out.println(c);
		}
	}

}
