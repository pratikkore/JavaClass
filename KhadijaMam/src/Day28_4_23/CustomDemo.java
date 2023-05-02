package Day28_4_23;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
	int iId;
	String iName;
	int iPrice;

	Item() {
	}

	public Item(int iId, String iName, int iPrice) {
		super();
		this.iId = iId;
		this.iName = iName;
		this.iPrice = iPrice;
	}

	@Override
	public String toString() {
		return "iId=" + iId + ", iName=" + iName + ", iPrice=" + iPrice;
	}

	public static void display(ArrayList<Item> list) {
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).iPrice == list.get(j).iPrice) {
					count++;
				}
			}

			if (count >= 2) {
				System.out.println(list.get(i).iName);
			}
		}
	}

	public static void itContains(ArrayList<Item> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input : ");
		String user = sc.next();
		String available = "Item not Availabel..";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).iName.contains(user)) {
//				System.out.println("Availale");
				available = "Item Availabel...";
				break;
			}
		}
		System.out.println(available);

	}
}

public class CustomDemo {

	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item(1, "sope", 50));
		list.add(new Item(2, "shampoo", 50));
		list.add(new Item(3, "oil", 230));

		Item strItem = new Item();
//		Item.display(list);
		Item.itContains(list);

	}
}
