package Test7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Movies {
	int mId;
	String mName;
	ArrayList<String> actor;

	public Movies(int mId, String mName, ArrayList<String> actor) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.actor = actor;
	}

}

public class Problem12 {

	public static void main(String[] args) {
		ArrayList<Movies> al = new ArrayList<Movies>();

		al.add(new Movies(1, "RRR", new ArrayList<String>(Arrays.asList("Ram Charan", "NTR", "Alia Bhat"))));
		al.add(new Movies(2, "udan", new ArrayList<String>(Arrays.asList("Amitabh bacchan"))));
		al.add(new Movies(3, "vikram vedha", new ArrayList<String>(Arrays.asList("Hritik roshan", "Amitabh bacchan"))));

		Iterator itr = al.iterator();
		int count = 0;
		while (itr.hasNext()) {
			Movies m = (Movies) itr.next();

			ArrayList<String> al2 = m.actor;

			for (String a : al2) {
				if (a.equals("Amitabh bacchan")) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
