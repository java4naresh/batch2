package multithreading;

public class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<=1000; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}
	}

}
