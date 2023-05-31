package marchWrritenTest;

import java.util.LinkedList;
import java.util.Queue;

//21.	Create a queue of strings using linked list. Add 5 strings to this queue – 
//‘Virat’ , ‘Sachin’,’Ajinkya’ , ‘Kapil’ , ‘Dhoni’.
//1.	Add ‘Shikhar’ to the queue. Display queue.
//2.	Use peek method. What will be output.
//3.	Use poll method. Display queue after poll.
//4.	Use offer method. Display queue.

public class Problem21 {

	public static void main(String[] args) {
		Queue<String> qs = new LinkedList<String>();
		qs.add("Virat");
		qs.add("Sachin");
		qs.add("Ajinkya");
		qs.add("Kapil");
		qs.add("Dhoni");

		System.out.println(qs);

//		1)Add ‘Shikhar’ to the queue. Display queue.
		qs.add("Shikhar");
		System.out.println("adding shikhar" + qs);

//		2)Use peek method. What will be output.
		String usePEek = qs.peek();
		System.out.println("Output of peek method use =" + usePEek);

//		3) Use poll method. Display queue after poll.
		while (!qs.isEmpty()) {
			String e = qs.poll();
			System.out.println(e);
		}

////		4)use offer method. Display queue.
		qs.offer("rohit");
		System.out.println("useing offer method = " + qs);
	}
}
