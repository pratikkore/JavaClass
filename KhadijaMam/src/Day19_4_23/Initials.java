package Day19_4_23;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rahul kapil sharma";
		String s = str.toLowerCase();

		String[] s1 = s.split(" ");
		String ini = "";
		String lastName = "";

		for (int i = 0; i < s1.length; i++) {
			if (i != s1.length - 1) {
				char temp = (char) (s1[i].charAt(0) - 32);
				ini = ini + temp + ".";
			} else {
				char temp = (char) (s1[i].charAt(0) - 32);
				char chArr[] = s1[i].toCharArray();
				lastName = temp + "";
				for (int j = 1; j < chArr.length; j++) {
					lastName = lastName + chArr[j];
				}
			}
		}
		System.out.println(ini + lastName);

	}

}
