package synchronization;

  public class Task {
	  
	/*public synchronized static void print1to100() {
		
		for(int i= 1;i<101;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}  */
	
   public synchronized  void print1to100() {
		
		for(int i= 1;i<101;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}   


}
