package AssignmentOnConstructor;

public class Problem1to8 {
//1
	static long accountNo;
	static String customerName;

//	8 comment defult constructor ..

	public Problem1to8() {

	}

//	5
	public Problem1to8(long accountNo, String customerName) {
		this.accountNo = accountNo;
		this.customerName = customerName;
		System.out.println("i am parametrized constructor");
	}

	public static void main(String[] args) {

//		2
		Problem1to8 obj = new Problem1to8();

		System.out.println("Account Number : " + obj.accountNo);
		System.out.println("Customer Name : " + obj.customerName);

//		3

		accountNo = 1234;
		customerName = "Pratik";

		System.out.println("This is defult constructor ...");

//		4

		Problem1to8 obj2 = new Problem1to8();
		System.out.println("Account Number : " + obj2.accountNo);
		System.out.println("Account number : " + obj2.customerName);

//		6
		Problem1to8 obj3 = new Problem1to8(345, "xyz");
		System.out.println(obj3.accountNo);
		System.out.println(obj3.customerName);

//		7

		Problem1to8 obj4 = new Problem1to8(322, "PQR");
		System.out.println(obj4.accountNo);
		System.out.println(obj4.customerName);

		Problem1to8 obj5 = new Problem1to8(534, "java");
		System.out.println(obj5.accountNo);
		System.out.println(obj5.customerName);
	}
}
