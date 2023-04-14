package Day2Assignment;

public class TableClass {

	public void display() {
		int a = 30;
		for (int num = 1; num <= a; num++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(num * i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableClass obj = new TableClass();
		obj.display();
	}
}
