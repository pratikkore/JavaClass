package Day3Assignment;

import java.util.Scanner;

public class ShoopingC {

	int productId;
	String productName;
	int productPrice;
	int productQuntity;

	public void getDetails(int pId, String pName, int pPrice, int pQuntity) {
		productId = pId;
		productName = pName;
		productPrice = pPrice;
		productQuntity = pQuntity;
	}

	public void createBill() {
		int totalBill = productQuntity * productPrice;
		if (productQuntity > 0) {
			displayDetails();
			System.out.println("Total bill= " + totalBill);
		} else {
			System.out.println("\n You Are Not Entered Valid  Quntity...");
		}
	}

	public void displayDetails() {

		System.out.print("\n Product Id= " + productId + "\n Product Name= " + productName + "\n Product Price = "
				+ productPrice + "\n Product Quntity = " + productQuntity + " \n ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoopingC cus1 = new ShoopingC();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id ....");
		int id = sc.nextInt();
		System.out.println("Enter Product Name ....");
		String name = sc.next();
		System.out.println("Enter Product Price ....");
		int price = sc.nextInt();
		System.out.println("Enter Product Quntity ....");
		int quntity = sc.nextInt();

		cus1.getDetails(id, name, price, quntity);
		cus1.createBill();
	}

}
