package Test2;

public class Problem11 {

//    Print the Series 
//2 12 36 80 150 252....upto 10 terms

//	1=sqr+cube;
//	2=sqr+cube;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sqr, cube, ans = 0;
		for (int i = 1; i <= 10; i++) {
			sqr = i * i;
			cube = i * i * i;
			ans = sqr + cube;
			System.out.println(ans);
		}

	}

}
