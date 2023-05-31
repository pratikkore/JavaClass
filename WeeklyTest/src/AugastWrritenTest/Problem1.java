package AugastWrritenTest;

//1)find the output

public class Problem1 {
	static {
		System.out.println(ACCOUNT_TYPE.DEMAT.rate_of_interest);
		System.out.println(ACCOUNT_TYPE.SAVING.rate_of_interest);

	}

	public static void main(String[] args) {
		System.out.println("ABA");
	}
}

enum ACCOUNT_TYPE {
	CURRENT, SAVING(8.0f), DEMAT;

	public float rate_of_interest;
	static {
		System.out.println("in static");
	}
	{
		System.out.println("in instance");
	}

	ACCOUNT_TYPE(float r) {
		rate_of_interest = r;
		System.out.println("in constructor");
	}

	ACCOUNT_TYPE() {
		System.out.println("in constructor");
	}
}

//output = in instance
//in constructor
//in instance
//in constructor
//in instance
//in constructor
//in static
//0.0
//8.0
//ABA
