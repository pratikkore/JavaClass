package Threads;


class UserThread2 extends Thread
{
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon");
			UserThread1.show_services();
		}
		else
			System.out.println("User thread");
	}
}

public class DaemonThread 
{
	

	public static void main(String[] args) {
		
	UserThread2 d=new UserThread2();
	//	d.setDaemon(true);
		d.start();
	}

}

class UserThread1 extends Thread
{
	public static void show_services()
	{
		System.out.println("checking memory");
	}
	
}
