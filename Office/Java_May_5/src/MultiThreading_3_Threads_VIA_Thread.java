
public class MultiThreading_3_Threads_VIA_Thread extends Thread {
	MultiThreading_3_Threads_VIA_Thread(){
		super("New Thread");
		System.out.println("New thread is : "+ this);
		this.start();
	}
	
	public void run() {
		System.out.println("Inside run");
		for(int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Value of Thread 2 is " + i);
		}
	}
	
	public static void main(String[] args) {
		new MultiThreading_3_Threads_VIA_Thread();
		
		for(int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Value of Thread 1 is " + i);
		}

	}
	

}