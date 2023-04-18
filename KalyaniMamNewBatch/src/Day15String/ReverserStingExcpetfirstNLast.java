package Day15String;

import java.util.Scanner;

public class ReverserStingExcpetfirstNLast {

	public void display(String str) {

		String[] sp = str.split(" ");
		String mainReveString = "";
		for (int i = 0; i < sp.length; i++) {
			if (i != 0 && i != sp.length - 1) {
				String revString = "";
				String wordString = sp[i];
				for (int j = wordString.length() - 1; j >= 0; j--) {
					revString = revString + wordString.charAt(j);
				}
				mainReveString = mainReveString + revString + " ";
			} else {
				mainReveString = mainReveString + sp[i] + " ";
			}
		}
		System.out.println(mainReveString);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User String : ");
		String str = sc.nextLine();

		ReverserStingExcpetfirstNLast obj = new ReverserStingExcpetfirstNLast();
		obj.display(str);
	}
}
