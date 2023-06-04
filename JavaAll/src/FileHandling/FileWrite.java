package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/file_hand/file1.txt");
		FileOutputStream fos = new FileOutputStream(f);

//1
		fos.write(90);
		String s = "Welcome to file handling";
		byte arr[] = s.getBytes();

//2
		String s2 = "welcome to file handling";
		byte arr1[] = s2.getBytes();

//3
		fos.write(arr1, 11, 13);
		System.out.println("file written succefully ");

	}

}
