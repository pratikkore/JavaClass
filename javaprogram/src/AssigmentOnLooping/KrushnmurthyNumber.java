//13.	 check no is krishnamurthi or not

//     153=1!+5!+3!=153

package AssigmentOnLooping;

public class KrushnmurthyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 135;
		int temp = num;
		int ans = 0;
		while (num != 0) {
			int r = num % 10;
			int fac = 1;
			for (int i = 1; i <= r; i++) {
				fac = fac * i;
			}
			num = num / 10;
			ans = ans + fac;
//			System.out.println(fac);

		}
		if(temp==ans) {
			System.out.println("This number is krishanmurthi number ..");
		}else {
			System.out.println("This number is  not krishanmurthi number ..");
		}
	
	}

}
