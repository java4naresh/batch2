package synchronization;

public class Tasks {

	static {
		synchronized(Tasks.class) {

		}
	}

	/*public synchronized static   void print1to500() {
		for(int i = 0; i < 500; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());

	}
}*/
	public synchronized   void print1to500() {
		for(int i = 0; i < 500; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}