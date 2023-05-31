package AugastWrritenTest;

//14)Reverse middle words of a string [1M]

//Given a string str, print reverse all words except the first and last words.
//Examples:
//Input  : Hi how are you students 
//Output  : Hi woh era uoy students

public class Problem14 {

	public static void main(String[] args) {
		String str = "Hi how are you students";

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

}
