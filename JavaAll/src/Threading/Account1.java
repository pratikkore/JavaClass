package Threads;

class Account {
	int balance=1000;
	
	synchronized void deposit(int deposit)
	{
		balance=balance+deposit;
		System.out.println("balance deposited");
		System.out.println("current balance is.."+balance);
		notifyAll();
	}
	
	synchronized void withdraw(int withdraw) throws InterruptedException
	{
		if(balance<withdraw) {
			wait();//being notified
		}
		balance=balance-withdraw;
		System.out.println("balance withdraw");
		System.out.println("current balance is.."+balance);
		
	}
}

class Thread1 extends Thread
{
	Account a;
	String name;
	Thread1(Account a)
	{
	 this.a=a;
	 this.name="Thread1";
	 start();
		
	}
	public void run()
	{
		try {
			a.withdraw(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread
{
	Account a;
	String name;
	Thread2(Account a)
	{
	 this.a=a;
	 this.name="Thread1";
	 start();
		
	}
	public void run()
	{
		
			a.deposit(7000);
		} 
		
}

class Thread3 extends Thread
{
	Account a;
	String name;
	Thread3(Account a)
	{
	 this.a=a;
	 this.name="Thread1";
	 start();
		
	}
	public void run()
	{
		
			try {
				a.withdraw(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
}


	public class Account1 
	{
	
	public static void main(String[] args) {
		Account a=new Account();
		Thread1 t=new Thread1(a);//1
		
		Thread2 t1=new Thread2(a);
		
		Thread3 t3=new Thread3(a);//2
		

	}

}
