package multithreading;

public class MyThreadClient {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		MyThread mt = new MyThread();
		mt.setName("my thread");
		System.out.println(mt.getPriority());
		mt.setPriority(10);
		System.out.println(mt.getPriority());
		mt.start();
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		MyThread mt2 = new MyThread();
		System.out.println(mt2.getPriority());
		mt2.start();
		mt2.setName("my thread2");
		mt.run();

	}

}
