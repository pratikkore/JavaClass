package Day19_4_23;

public class RemoveFirstOccurance {

	public void display(String str) {

		char remove = 'a';
		int indexRemove = str.indexOf(remove);
		for (int i = 0; i < str.length(); i++) {
			if (i != indexRemove) {
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		String str = "hello java";

		RemoveFirstOccurance obj = new RemoveFirstOccurance();

		obj.display(str);
	}

}
