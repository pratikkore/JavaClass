package Day4Assignment;

public class AccessModifers {

	private int num = 10;

	protected int number = 20;

	public int digit = 30;

	private void priv() {
		System.out.println("this is private ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifers obj = new AccessModifers();

		System.out.println(obj.num);

		System.out.println(obj.number);

		obj.priv();
	}

}
