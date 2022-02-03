package multithreading;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=1000; i++) {
			System.out.println(i+" "+ currentThread().getName());
		}
	}
	
	public void run(String name) {
		System.out.println("run");
	}
	
	/*public void start() {
		for(int i=0; i<=1000; i++) {
			System.out.println(i+" "+ currentThread().getName());
		}
	}*/
	
	

}
