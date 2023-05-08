package Test6;

//check string is palindrom or not 

public class Problem16 {

	public static void main(String[] args) {

		String s = "nitin";

		String temp = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}
		System.out.println(temp);
		if (temp.equals(s)) {
			System.out.println("String is palindrome .....");
		} else {
			System.out.println("String is not palindrome...");
		}
	}

}
