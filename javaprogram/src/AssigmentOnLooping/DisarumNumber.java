//14.	Disarum no 135=1+3*3+5*5*5=135

package AssigmentOnLooping;

public class DisarumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
