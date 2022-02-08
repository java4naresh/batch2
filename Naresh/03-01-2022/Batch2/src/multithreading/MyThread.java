package multithreading;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		if("MyThread".equals(Thread.currentThread().getName())) {
			//Thread.yield();
			/*try {
				Thread.currentThread().join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			print1to100();
		} else if("MyThread2".equals(Thread.currentThread().getName())) {
			print1to1000();
		} else {
			print1to500();
		}
			
		
	}
	
	private void print1to500() {
		for(int i=0; i<=500; i++) {
			System.out.println(i+" "+ currentThread().getName());
		}
	}

	private void print1to1000() {
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		for(int i=0; i<=1000; i++) {
			System.out.println(i+" "+ currentThread().getName());
		}
	}

	private void print1to100() {
		try {
			Thread.currentThread().join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<=100; i++) {
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
