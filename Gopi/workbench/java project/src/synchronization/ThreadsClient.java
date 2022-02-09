package synchronization;

public class ThreadsClient {
	
	

	public static void main(String[] args) {
		
	/*	MyThreads mt = new MyThreads();
		Thread thread = new Thread(mt);
		thread.setName("mt1");
		thread.getPriority();
		thread.start();
		
		MyThreads mt2 = new MyThreads();
		Thread thread2 = new Thread(mt2);
		thread2.setName("mt2");
		thread2.setPriority(9);
		thread2.start();
		//mt.run(); 
		MyThreads mt3 = new MyThreads();
		Thread thread3 = new Thread(mt3);
		thread3.setName("mt3");
		thread3.setPriority(7);
		thread3.start();  */
		
	/*	Task task = new Task();
		MyThreads mt = new MyThreads(task);
		Thread thread = new Thread(mt);
		thread.setName("mt1");
		//thread.getPriority();
		thread.start();
		
		MyThreads mt2 = new MyThreads(task);
		Thread thread2 = new Thread(mt2);
		thread2.setName("mt2");
		thread2.getPriority();
		thread2.start();
		
		MyThreads mt3 = new MyThreads(task);
		Thread thread3 = new Thread(mt3);
		thread3.setName("mt3");
		thread3.setPriority(7);
		thread3.start();     */
		
		Task task = new Task();
		MyThreads mt = new MyThreads(task);
		Thread thread = new Thread(mt);
		thread.setName("mt1");
		//thread.getPriority();
		thread.start();
		Task task2 = new Task();
		MyThreads mt2 = new MyThreads(task2);
		Thread thread2 = new Thread(mt2);
		thread2.setName("mt2");
		thread2.getPriority();
		thread2.start();
		Task task3 = new Task();
		MyThreads mt3 = new MyThreads(task3);
		Thread thread3 = new Thread(mt3);
		thread3.setName("mt3");
		thread3.setPriority(7);
		thread3.start();     
		
	}

}
