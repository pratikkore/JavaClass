package Day16StringBuffer;

public class StringPalandrome {

	public static void main(String[] args) {

		String str = "madam";

		StringBuffer str1 = new StringBuffer(str);

		str1.reverse();
		String rev = str1.toString();

		System.out.println("Main String : " + str);
		System.out.println("Reverse String : " + rev);
		System.out.println("*****************************************");

		if (rev.equals(str)) {
			System.out.println("String is Palandrome....");
		} else {
			System.out.println("Not Palandrome....");
		}
	}
}
