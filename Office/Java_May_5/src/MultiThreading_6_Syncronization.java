class callme {
	 void call(String msg)  {
		System.out.println("[");
	//	Thread.sleep(1000);
		System.out.println(msg);
	//	Thread.sleep(1000);
		System.out.println("]");
	}
}

class thread_creation implements Runnable{
	Thread t;
	String message;
	public thread_creation(String msg) {
		t = new Thread(this, msg);
		message = msg;
		t.start();
	}
	
	@Override
	public void run() {
		callme obj1 = new callme();
		synchronized (obj1) {
			obj1.call(message);
		}
		
	}
	
}
public class MultiThreading_6_Syncronization {
	
	public static void main(String[] args) {
		thread_creation obj1 = new thread_creation("Hello");
		thread_creation obj2 = new thread_creation("World");
		thread_creation obj3 = new thread_creation("Ishmeet");
		
		
		
	}

}
	