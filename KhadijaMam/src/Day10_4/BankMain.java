package Day10_4;

class Bank {
	Loan applyLoan() {
		System.out.println("Applying Loan");
		return new Loan();
	}
}

class HDFC extends Bank {
	@Override
	HomeLoan applyLoan() {
		System.out.println("Gold Loan..");
		return new HomeLoan();
	}
}

public class BankMain {

	public static void main(String[] args) {

		Loan loan1 = new GoldLoan();
		GoldLoan g = (GoldLoan) loan1;
		System.out.println(g);

		Loan loan2 = new HomeLoan();

		Object o = new String();

		Loan l = new HomeLoan();

	}

}
