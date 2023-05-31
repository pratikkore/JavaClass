package marchWrritenTest;

public class Problem17 {
	int intVar = 0;

	static String strVar = "InnerClassExample";// create static variable
	private int intPvt = 4;
	public static int intStatic = 61;
	private static String strPvtStatic = " java";

	private void printVar() {
		System.out.println(intVar + " " + strVar + " " + intPvt);
	}

	static class Nested {

		public void InnerVar() {

			System.out.println(" variable from outer class " + strVar);

			System.out.println(" static variable from outer class " + intStatic);

			System.out.println(" I am from static inner class");

		}
	}

	class InnerClass {

		int intInner = 9;
		int num = 0; // remove static modifier
		static final int numConstant = 10;

		String strInner = " I am string in innerclass";

		public void printInnerVar() {

			System.out.println(" I am from inner class " + strVar);

		}

	}

	public static void main(String[] args) {
		Problem17 sn = new Problem17();
		Problem17 icd = new Problem17();

		Problem17.InnerClass inObj = icd.new InnerClass();
		inObj.printInnerVar(); // 8
	}
}