package Day19InnerClass;

abstract class Template {
	abstract void myDesign();

}

public class AnnonymiusClass {

	public static void main(String[] args) {

		Template t = new Template() {
			@Override
			public void myDesign() {
				System.out.println("This home Design");
			}
		};
		t.myDesign();
	}
}
