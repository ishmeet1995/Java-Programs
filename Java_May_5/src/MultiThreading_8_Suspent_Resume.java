class suspend_resume implements Runnable{
	String message;
	Boolean suspend_flag = false;
	Thread t;
	suspend_resume(String thread_name){
		t = new Thread(this,thread_name);
		message = thread_name;
		t.start();
	}
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 15; i++) {
				System.out.println("Thread: " + message + " " + i);
				try {
					Thread.sleep(700);
				} catch (Exception e) {
				}
				while (suspend_flag) {
					try {
						System.out.println("wait activated");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("wait deactivated");

			}
		}
		
		
	}
	
	public void suspend() {
		suspend_flag = true;
	}
	
	public void resume() {
		suspend_flag = false;
		notify();
		
	}
	
}
public class MultiThreading_8_Suspent_Resume{
	public static void main(String[] args)  throws Exception {
		suspend_resume obj1 = new suspend_resume("Thread1");
		suspend_resume obj2 = new suspend_resume("Thread2");
		
		obj1.suspend();
		Thread.sleep(1000);
	  	obj1.resume();
		Thread.sleep(1000);
		
		obj2.suspend();
		Thread.sleep(1000);
		obj2.resume();
		Thread.sleep(1000);
		
		obj1.t.join();
		obj2.t.join();
	}
}
