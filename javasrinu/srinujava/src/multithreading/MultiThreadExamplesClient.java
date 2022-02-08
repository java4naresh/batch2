package multithreading;

public class MultiThreadExamplesClient {

	
	public static void main(String[] args) {
		
		MultiThreadExamples me = new MultiThreadExamples();
		me.setName("my thread");
		
		me.start();
		
		MultiThreadExamples me2 = new MultiThreadExamples();
		me2.setName("my thread2");
		
		me2.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		me2.run();
	}
}
