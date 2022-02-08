package multithreading;

public class MultiThreadExamples extends Thread {

	public void run() {
		if ("my thread".equals(Thread.currentThread().getName())){
			
			print1to100();
		}else if ("my thread2".equals(Thread.currentThread().getName())) {
			print1to500();
		}else print1to200();
	}

	private void print1to200() {
	
		for(int i = 0;i < 200; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

	private void print1to500() {
		Thread.yield();
		for(int i = 0;i < 500; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

	private void print1to100() {
		try {
			Thread.currentThread().join(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		for(int i = 0;i < 100; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
		
	}
	
}
