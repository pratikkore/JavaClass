package Day2Assignment;

public class AverageofPrimeNumb {

	public void display() {
		int sum = 1;
		int count = 1;
		for (int num = 1; num <= 10; num++) {

			int isPrime = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					isPrime++;
//					break;
				}
			}
			if (isPrime == 2) {
				count++;
				sum = sum + num;
			}
		}
		System.out.println();
		System.out.println("Average of prime number is =" + (float) sum / count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageofPrimeNumb obj = new AverageofPrimeNumb();
		obj.display();
	}

}
