package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args)  {
		FileInputStream fis1=null;
		FileInputStream fis=null;
		Scanner sc=null;
		try
		{
			 fis1=new FileInputStream("E://Vaio//java_programs/Simple_Program.java");
			 fis=new FileInputStream("E://Vaio//java_programs/Simple_Program1.java");
			
		 sc=new Scanner(fis1);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
	} 
		catch(Exception e)
		{
			System.out.println("file not found");
		}
	
	finally
	{
		try {
			fis1.close();
			fis.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		System.out.println("rest of code");
		
		
	}
}


