package Day10Assignment;

interface Furniture {

	void chair();
}

class chair implements Furniture {
	@Override
	public void chair() {
		System.out.println("this is office chair   .....");
	}
}

class Table implements Furniture {
	@Override
	public void chair() {
		System.out.println("this is boss chair .... ");
	}
}

public class FurnitureInterface {

	public static void main(String[] args) {
		Furniture f = new chair();
		f.chair();

		Furniture f1 = new Table();
		f1.chair();
	}
}