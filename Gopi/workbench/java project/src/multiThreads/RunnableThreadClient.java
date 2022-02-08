package multiThreads;

public class RunnableThreadClient {

	public static void main(String[] args) {
		
		MyRunnableThread mrt = new  MyRunnableThread();
		Thread t = new Thread(mrt);
		t.setName("myThread");
		t.start();
		t.run();
		//mrt.run();
		
		
	
		
	}
	

}
