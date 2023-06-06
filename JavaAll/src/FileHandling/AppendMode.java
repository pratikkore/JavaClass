package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppendMode {

	public static void main(String[] args) throws IOException {
		File f=new File("e:/file_han/file3.txt");
		
	FileOutputStream fos=new FileOutputStream(f,false);	
	String s="This cheat sheet shows you how to create the famous \"Hello World\" \r\n"
			+ "application and try it out. You will create a Java project and a Java \r\n"
			+ "class that will print \"Hello world!\" in the console when run.";
	byte arr[]=s.getBytes();
	
	fos.write(arr);
	System.out.println("file written sucessfully");
	fos.close();

	}

}
