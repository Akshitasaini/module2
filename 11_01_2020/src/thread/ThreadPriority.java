package thread;
public class ThreadPriority {
	public static void main(String[] args) {
		//SimpleThreadDemo demo = new SimpleThreadDemo();

		Thread t1 = new ThreadDemo("delhi");
		t1.start();
		t1.setPriority(10);

		Thread t2 = new ThreadDemo("gurugram");	
		t2.start();
		t2.setPriority(3);

        Thread t3 = new ThreadDemo("noida");
		t3.start();
		
		t3.setPriority(5);
	}

}
