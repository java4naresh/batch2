package synchronization;

public class ThreadClient {

	public static void main(String[] args) {

		Tasks t = new Tasks();
		MyThread mt = new MyThread(t);
		Thread thread = new Thread(mt);
		thread.setName("mt1");
		thread.start();
		MyThread mt2 = new MyThread(t);
		Thread thread2 = new Thread(mt2);
		thread2.setName("mt2");
		
		thread2.start();
		//mt.run();
	}

}
