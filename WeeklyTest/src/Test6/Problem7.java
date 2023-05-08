package Test6;

public class Problem7 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Poly");
		System.out.println(sb.append("Morph"));
		sb.reverse();
		String str = sb.toString();
		System.out.println(str.substring(5));

	}

}

//output
//PolyMorph
//yloP