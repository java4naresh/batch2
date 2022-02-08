package myThreads;

public class ThreadClient {

	public static void main(String[] args) {
		
		
		Thread t = new Thread();
		t.setPriority(2);
		System.out.println(t.getPriority());
		ThreadsTest tt = new ThreadsTest();
		//tt.getPriority();
		tt.setPriority(2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		tt.start();
		tt.yield();
		tt.setName("myThreads");
		
		System.out.println(tt.getPriority());		
		//tt.start();
		ThreadsTest tt1 = new ThreadsTest();
		tt1.setPriority(2);
		tt1.start();
		tt1.setName("myThreads2"); 
		tt1.run();
		
		System.out.println(tt1.getPriority());
		
		
	}

}
