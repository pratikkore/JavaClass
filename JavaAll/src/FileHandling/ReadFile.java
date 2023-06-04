package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/file_hand/file2.txt");
		FileInputStream fis = new FileInputStream(f);
		System.out.println(fis.available());
		byte arr[] = new byte[fis.available()];

		fis.read(arr, 0, 12);
		for (int i = 0; i < 12; i++) {
			System.out.print((char) arr[i]);
		}
	}
}
