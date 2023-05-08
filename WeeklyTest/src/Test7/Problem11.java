package Test7;

import java.util.ArrayList;

//11.	Create a class shoppingcart with following details - 
//ShoppingCart { int shopid; String custname; List<Item> ,Int qty; String pmode}
//Write method to accept shopping details with list of purchase items and purchase qty. 
//If pqty is negative or zero raise customized exception Invalid qty Write a method void generatebill () 
//to display shopping details along with total for Customer.

class ShoppingCart {
	int shopId;
	String custName, pmode;
	ArrayList<Item> items;

	public ShoppingCart(int shopId, String custName, String pmode) {
		super();
		this.shopId = shopId;
		this.custName = custName;
		this.pmode = pmode;
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) throws InvalidQuantityException {
		if (item.qty <= 0) {
			throw new InvalidQuantityException("Invalid quantity");
		}
		items.add(item);
	}

	public void generateBill() {
		double total = 0;
		System.out.println("Shopping details:");
		System.out.println("Shop ID: " + shopId);
		System.out.println("Customer Name: " + custName);
		System.out.println("Payment Mode: " + pmode);
		System.out.println("Items:");
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			int qty = item.qty;
			double price = item.price;
			double itemTotal = qty * price;
			total += itemTotal;
			System.out.println(item.itemName + " x " + item.qty + " - " + price + " =" + itemTotal);
		}
		System.out.println("Total: " + total);
	}
}

class InvalidQuantityException extends Exception {

	public InvalidQuantityException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class Item {
	String itemName;
	double price;
	int qty;

	public Item(String itemName, double price, int qty) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}

}

public class Problem11 {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart(1, "Pratik Kore", "Credit Card");

		try {
			cart.addItem(new Item("Shirt", 2219.99, 2));
			cart.addItem(new Item("Pants", 1239.99, 1));
			cart.addItem(new Item("Shoes", 859.99, -1));
		} catch (InvalidQuantityException e) {
			System.err.println(e.getMessage());
		}
		cart.generateBill();

	}

}
