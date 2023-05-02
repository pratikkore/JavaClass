package Day23FailFast;

import java.util.ArrayList;
import java.util.Iterator;

class Menu {
	int menuId;
	String menuName;
	MenuItem menuItem;

	public Menu(int menuId, String menuName, MenuItem menuItem) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuItem = menuItem;

	}

	@Override
	public String toString() {
		return "\nmenuId=" + menuId + ", menuName=" + menuName + " \nmenuItems " + menuItem;
	}

}

class MenuItem {
	int itemId;
	String ItemName;
	int price;

	public MenuItem(int itemId, String itemName, int price) {
		super();
		this.itemId = itemId;
		ItemName = itemName;
		this.price = price;

	}

	@Override
	public String toString() {
		return "\nitemId=" + itemId + ", ItemName=" + ItemName + ", price=" + price;
	}

}

public class MenuArrayList {

	public static void main(String[] args) {
		ArrayList<Menu> arr = new ArrayList<Menu>();
		arr.add(new Menu(1, "veg", new MenuItem(201, "paneer", 320)));
		arr.add(new Menu(2, "veg", new MenuItem(204, "kaju kari", 400)));

		Iterator itr = arr.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
