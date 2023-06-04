package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_file {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/file_hand/copy_file.txt");
		File f1 = new File("D:/file_hand/copy_file1.txt");
		FileOutputStream fos = new FileOutputStream(f1);

		FileInputStream fis = new FileInputStream(f);
		byte arr[] = new byte[fis.available()];

		fis.read(arr);
		for (byte b : arr) {
			System.out.println((char) b);
		}
		System.out.println("read succefully");
		fos.write(arr);
		System.out.println("written succefully ..");
	}

}
