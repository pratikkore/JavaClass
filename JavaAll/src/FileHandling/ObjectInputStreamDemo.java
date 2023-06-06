package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectInputStreamDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		File f = new File("D:/file_hand/emp.dat");
		FileInputStream fos = new FileInputStream(f);
		ObjectInputStream oos = new ObjectInputStream(fos);

		ArrayList<Employee> al = null;
		try {
			al = (ArrayList<Employee>) oos.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		Iterator<Employee> it = al.iterator();

		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.id + " " + e.name + " " + e.salary + " " + e.pincode);
		}
	}

}
