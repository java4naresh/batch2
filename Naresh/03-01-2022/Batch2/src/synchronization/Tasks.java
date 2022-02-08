package synchronization;

public class Tasks {
	
	static {
		synchronized(Tasks.class) {
			
		}
		
	}
	
	public synchronized void print1to500() {
		for (int i = 1; i < 501; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

}
