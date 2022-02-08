package multithreading;

public class MyRunnableThreadlient {

	public static void main(String[] args) {
		MyRunnableThread mrt = new MyRunnableThread();
		Thread  t = new Thread(mrt);
		t.setName("Thread 1");
		t.start();
		t.run();

	}

}
