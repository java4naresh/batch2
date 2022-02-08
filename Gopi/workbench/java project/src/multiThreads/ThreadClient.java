package multiThreads;

public class ThreadClient {

	public static void main(String[] args) {
		
		
		MyThread mt = new MyThread();
		
		mt.start();
		mt.setName("myThread");
	mt.run();
		
	/*	MyThread mt2 = new MyThread();
		mt2.setName("myThread2");
		mt2.start();
		mt2.run();*/
	}

}
