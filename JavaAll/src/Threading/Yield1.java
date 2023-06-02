package thread_pro;



class Document extends Thread//(is a)
{
	public void run()
	
	{
		
		String s=Thread.currentThread().getName();
		for(int i=1;i<=5;i++)
		{
			
		
		System.out.println(s+".........printing Documents");
		
			Thread.yield();
		
		}
	}

}
	
	class Task1 extends Thread
	{
		
		public void run()
		{
			String s=Thread.currentThread().getName();
			for(int i=1;i<=5;i++)
			{
				
			
			System.out.println(s+".....Doing some important tasks");
			//Thread.yield();
			}
		}
	}
	


public class Yield1 {

	public static void main(String[] args) {
     Document d=new Document();
		
		d.setName("Document class");
		d.setPriority(2);
		Task1 t=new Task1();
		t.setName("Task class");
		t.setPriority(8);
		d.start();
		t.start();

	}

}
