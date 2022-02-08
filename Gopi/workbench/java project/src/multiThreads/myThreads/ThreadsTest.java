package myThreads;
public class ThreadsTest extends Thread {
	
	public void run() {
		if("myThreads2".equals(Thread.currentThread().getName())) {
			//Thread.yield();
			try {
				Thread.currentThread().join(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		/*	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
		}
		
		for(int i=1;i<20;i++) {
			System.out.println(i+" " +Thread.currentThread().getName());
		}
	}

	

}
