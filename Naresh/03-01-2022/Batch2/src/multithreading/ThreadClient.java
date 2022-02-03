package multithreading;

public class ThreadClient {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.setName("MyThread");
		mt.start();//it will register new thread into Thread Scheduler and execute run method
	    //mt.start();
		MyThread mt2 = new MyThread();
	    mt2.setName("MyThread2");
	    mt2.start();
		mt.run();//method calling from main thread
	}

}
