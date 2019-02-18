package lambdaExpressions;

public class Lambda_wirh_Runnable {
	public static void main(String[] args) {
		Thread test1 = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Inside Typical runnable");
			}
		});
		
		Thread test2 = new Thread(()->{
			System.out.println("Inside new Runnable");
		});
		
		test1.start();
		test2.start();
		
		try {
			test1.join();
			test2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
