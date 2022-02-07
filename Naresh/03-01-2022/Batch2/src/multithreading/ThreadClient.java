package multithreading;

public class ThreadClient {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority());//Main Thread Priority
		MyThread mt = new MyThread();
		mt.setName("MyThread");
        System.out.println(mt.getPriority());
		//mt.setPriority(1);
		//System.out.println(mt.getPriority());
		mt.start();//it will register new thread into Thread Scheduler and execute run method
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//mt.start();
		MyThread mt2 = new MyThread();
	    mt2.setName("MyThread2");
	    mt2.setPriority(10);
	    mt2.start();
	    System.out.println(mt2.getPriority());
		mt.run();//method calling from main thread
	}

}
