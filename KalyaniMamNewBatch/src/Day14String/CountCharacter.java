package Day14String;

public class CountCharacter {

	public static void main(String[] args) {

		String s = "Hello";
		System.out.println("Count of character : " + s.length());

		System.out.println("**********************************************");

		String s1 = "Hello World";

		String[] s3 = s1.split(" ");

		System.out.println("count of the word : " + s3.length);

		System.out.println("**********************************************");

		String s4 = " I love codeing... ";

		System.out.println(s4.trim());

		System.out.println("**********************************************");
	}
}
