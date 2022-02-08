package multithreading;

public class MyThread extends Thread{

		
	
	public void  run(){
    /* if ("my thread".equals(Thread.currentThread().getName())){
    	 // Thread.yield();
    	 try {
			Thread.currentThread().join(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
      }*/  
		for(int i = 0; i < 1000; i++) {
			System.out.println(i+" "+currentThread().getName());

		}
		
	
	}
	public void run(String name) {
		System.out.println("run");
	}
	/*public void start() {

		for(int i = 0; i < 1000; i++) {
			System.out.println(i+" "+currentThread().getName());

		
	}*/
}
