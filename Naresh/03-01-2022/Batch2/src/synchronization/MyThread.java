package synchronization;

public class MyThread implements Runnable {
	
	private Tasks tasks = null;
	
	public MyThread(Tasks tasks ) {
		this.tasks = tasks;
	}

	@Override
	public void run() {
		if("mt2".equals(Thread.currentThread().getName())) {
			
				tasks.print1to200();
			
		} else {
		tasks.print1to500();
		}
	}

}
