package synchronization;

public class Tasks {
	
	static {
		synchronized(Tasks.class) {
			
		}
		
	}
	
	public synchronized void print1to200() {//mt2
		for (int i = 1; i < 201; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/*try {
			wait(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();*/
		print1to500(); //dead lock
		//print1to500();
	}
	
	public synchronized void print1to500() {//mt1
		for (int i = 1; i < 501; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		print1to200();//dead lock
		/*notify();
		try {
			wait(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}

}
