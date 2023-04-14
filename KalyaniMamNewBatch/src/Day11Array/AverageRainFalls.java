package Day11Array;

public class AverageRainFalls {

	public void display(Double arr[]) {
		double avg = 0;
		double sum = 0;
		for (double i = 0; i < arr.length; i++) {

			sum = sum + arr[(int) i];

//			System.out.println(sum);
		}
		avg = sum / arr.length;

		System.out.println(avg);
	}

	public static void main(String[] args) {
		Double[] arr = { 43.2, 54.21, 32.45, 43.5, 23.43, 28.32, 36.00 };

		AverageRainFalls obj = new AverageRainFalls();
		obj.display(arr);

	}
}
