package AugastWrritenTest;

interface Anonymous {
	public int getValue();

	public int getData();
}

public class Problem4 {
	private int data = 15;

	public static void main(String[] args) {
		Anonymous inner = new Anonymous() {
			int data = 5;

			public int getValue() {
				return data;
			}

			public int getData() {
				// TODO Auto-generated method stub
				return 0;
			}

//			public int getData() {
//				return data;
//			}
		};

		Problem4 outer = new Problem4();
		System.out.println(inner.getValue() + inner.getData() + outer.data);

	}

}

//output= compilation error 
//Create method getData 
//20