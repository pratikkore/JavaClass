package Test2;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, k = 1;
		while (i++ <= 5) {
			k *= i;
		}
		System.out.println("k=" + k + "i=" + i);

	}

}

//output is 
//k=720;
//i=7;