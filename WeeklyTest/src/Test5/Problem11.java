package Test5;

class Store {
	int noOfItemsAvaiable = 5;
	int maximumLevel = 10;
	int minimumLevel = 3;

	public void addItem() throws ItemStockOverFlowException {
		noOfItemsAvaiable++;
		if (noOfItemsAvaiable > maximumLevel) {
			throw new ItemStockOverFlowException("Excedes the Maximun Level");
		} else {
			System.out.println("Item Added...");
		}
	}

	public void removeItem() throws ItemStockUnderFlowException {
		noOfItemsAvaiable--;
		if (noOfItemsAvaiable < minimumLevel) {
			throw new ItemStockUnderFlowException("Can not go below minimun Level");
		} else {
			System.out.println("Item Removed...");
		}
	}

	public void checkStock() {
		System.out.println("Total Items: " + noOfItemsAvaiable);
	}
}

class ItemStockOverFlowException extends Exception {
	ItemStockOverFlowException(String msg) {
		super(msg);
	}
}

class ItemStockUnderFlowException extends Exception {
	public ItemStockUnderFlowException(String msg) {
		super(msg);
	}
}

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store s = new Store();
		try {

			s.addItem();
			s.addItem();
			s.addItem();
			s.addItem();
			s.addItem();
			s.addItem();
			s.addItem();

		} catch (ItemStockOverFlowException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		try {
			s.removeItem();
			s.removeItem();
			s.removeItem();
			s.removeItem();
			s.removeItem();
			s.removeItem();
			s.removeItem();
			s.removeItem();
			s.removeItem();
			s.removeItem();
			s.removeItem();

		} catch (ItemStockUnderFlowException e1) {
			// TODO: handle exception
			System.out.println(e1);
		}

	}

}
