package Test4;

public class Problem9 {

	public static void main(String[] args) {

		{
			int var[] = new int[10];
			for (int i = 0; i < 10; ++i) {
				var[i] = i;
				System.out.println(var[i] + "  ");
				i++;
			}

		}
	}
}

//output=
//0
//2
//4
//6
//8
