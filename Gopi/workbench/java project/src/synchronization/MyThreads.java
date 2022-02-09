package synchronization;

public class MyThreads implements Runnable {
	
	
  /*	public void run() {
		
		 Task.print1to100();
	} */
	
	
	
	
	
  	private Task task;
	
	public MyThreads(Task task) {
		this.task = task;
	}
	public void run() {
		
		 task.print1to100();
	}  

}
