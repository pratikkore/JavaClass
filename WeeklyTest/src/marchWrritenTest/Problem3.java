package marchWrritenTest;

//3.	Print 1 2 3 4 5 one below the other but using recursive method only [1M] 1 2 3 4 5

public class Problem3 {

	void display(int i) {
		if (i >= 5) {
			System.out.println(i);
			i++;
			display(i);
		}
	}

	public static void main(String[] args) {
		Problem3 p = new Problem3();
		p.display(1);
	}

}
