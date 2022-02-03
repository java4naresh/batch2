package multithreading;

public class MyRunnableThreadClient {

	public static void main(String[] args) {

		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();//it will register new thread into Thread Scheduler and execute run method
		t.run();//main thread
		
	}

}
