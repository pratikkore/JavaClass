package marchWrritenTest;

public class Problem1 {

	public static void main(String[] args) {
		int j = 2, k = 2;

		System.out.println(j-- - --j - --j + ++k - k-- + (j - k) + --j + j++ - --k + ++k);
	}

}

//output = -3
