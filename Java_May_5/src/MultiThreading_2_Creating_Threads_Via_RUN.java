
public class MultiThreading_2_Creating_Threads_Via_RUN implements Runnable{
	Thread t;
	Thread t2;
	public MultiThreading_2_Creating_Threads_Via_RUN() {
		// TODO Auto-generated constructor stub
		t = new Thread(this, "New Thread");
		t2 = new Thread(this,"2nd thread");
		System.out.println("Thread = " + t);
		System.out.println("Thread = " + t2);
		t.start();	
		t2.start();
	}
	
	
	public void run() {
		System.out.println("Inside the run()");
	}
	
	public static void main(String[] args) {
		new MultiThreading_2_Creating_Threads_Via_RUN();
		Thread  t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("Ishmeet's First Thread");
		System.out.println(t.getName());
		

	}

}
