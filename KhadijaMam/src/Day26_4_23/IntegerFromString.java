package Day26_4_23;

public class IntegerFromString {

	public static void main(String[] args) {

		String str = "Virat score is 96";

		int sum = 0;
		int count = 0;
		int avg = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				int x = Character.getNumericValue(str.charAt(i));
				sum = sum + x;
				count++;
			}
		}

		avg = sum / count;
		System.out.println("Average is : " + avg);
	}
}
