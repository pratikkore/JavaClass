package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Backend\\java\\eclips workspace\\JavaAll\\src\\FileHandling/File1.txt");
		f.createNewFile();
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());

	}

}
