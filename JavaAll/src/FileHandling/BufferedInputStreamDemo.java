package files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("e:/File_han/File2.txt");
		FileInputStream fis=new FileInputStream(f);
		
		BufferedInputStream bis=new BufferedInputStream(fis);
		System.out.println(fis.available());
		int x=0;
		
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}
	}

}
