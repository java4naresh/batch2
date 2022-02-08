package synchronization;

public class MyThread implements Runnable {
	
	private Tasks tasks = null;
	
	public MyThread(Tasks tasks ) {
		this.tasks = tasks;
	}

	@Override
	public void run() {
		tasks.print1to500();
	}

}
