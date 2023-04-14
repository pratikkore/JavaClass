//Wap to find neon/kaparekar  number 

package AssigmentOnLooping;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 55;
		int squr = num * num;
		int ans = 0;
		int temp = num;
		while (squr != 0) {
			int r = squr % 10;
			ans = r + ans;
			squr = squr / 10;
		}
		if (temp == ans) {
			System.out.println("this is neon number");
		} else {
			System.out.println("this is not neon number");
		}
	}

}
