package Day2;

public class Book {

	int b_id;
	long b_price;
	String b_name;
	double discount;

	public void setB_Id(int id) {
		this.b_id = id;
	}

	public void setB_Price(long price) {

		this.b_price = price;
	}

	public void setB_Name(String name) {
		this.b_name = name;
	}

	public int getId() {
		return b_id;
	}

	public long getPrice() {
		return b_price;
	}

	public String getName() {
		return b_name;
	}

	public void display() {
		if (b_price > 500) {
			discount = b_price * 0.10;
			b_price = (int) (b_price - discount);
			System.out.println("you get 10% discount on total price ..");
			System.out.println("Your final book Price is : " + b_price);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book();

		obj.setB_Id(2);
		obj.setB_Name("Abc");
		obj.setB_Price(900);

		System.out.println(" \n Book id :" + obj.getId() + "\n Book Name : " + obj.getName() + "\n Book Price : "
				+ obj.getPrice() + " Rs");

		obj.display();
	}

}
