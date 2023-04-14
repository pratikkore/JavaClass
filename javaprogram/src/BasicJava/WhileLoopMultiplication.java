package BasicJava;

public class WhileLoopMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;

		int ans = 1;

		while (a <= b) {
//			System.out.println(a);
			ans = (a * ans);
			a++;
		}
		System.out.println(ans);
	}

}
