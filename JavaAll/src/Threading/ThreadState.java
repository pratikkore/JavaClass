package thread_pro;

public class ThreadState {

	public static void main(String[] args) {
		Thread.State [] states= Thread.State.values();
		for(Thread.State s: states)
		{
			System.out.println(s);
		}
	}

}
