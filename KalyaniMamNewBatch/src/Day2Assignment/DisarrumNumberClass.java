package Day2Assignment;

public class DisarrumNumberClass {

	public void display() {
		int ans = 175;
		int sum = 0;
		int temp = ans;
		int orignalNum = ans;
		int j = 0;

		while (ans != 0) {
			int r = ans % 10;
			j++;
			ans = ans / 10;
		}
		while (temp != 0) {
			int mul = 1;
			int r = temp % 10;
			for (int i = j; i >= 1; i--) {
				mul = mul * r;
			}
			sum = mul + sum;
			j--;
			temp = temp / 10;
		}
		if (sum == orignalNum) {
			System.out.println("This Number is Disarum");
		} else {
			System.out.println("This Number is Not Disarum");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisarrumNumberClass objClass = new DisarrumNumberClass();
		objClass.display();
	}

}
