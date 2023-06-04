package Threads;


class Reserve implements Runnable
{
	int available=1;
	int booking;
	Reserve(int booking)
	{
		this.booking=booking;
	}
	
	synchronized public void run()
	{
		String s=Thread.currentThread().getName();
		System.out.println("Available berth..."+available);
		System.out.println(s+"...Booking berth");
		if(available>=booking)
		{
			System.out.println("Berth reserve for.."+s);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			available=available-booking;
		}
		else
	System.out.println("no berth availabe");
			
	
		
		
	}
}

public class ThreadSynchronization {

	public static void main(String[] args) {
		Reserve r=new Reserve(1);
		
		
		Thread t1=new Thread(r,"Archana");
		
		t1.start();
		
        Thread t2=new Thread(r,"pranali");
		
		t2.start();
		
		
	}

}
