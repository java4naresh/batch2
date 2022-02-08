package synchronization;

public class MyThreadClient {

	public static void main(String[] args) {
		Tasks task = new Tasks();
		MyThread mt = new MyThread(task);
		Thread t = new Thread(mt);
		t.setName("s1");
		t.start();
		MyThread mt2 = new MyThread(task);
		Thread t2 = new Thread(mt2);
		t2.setName("s2");
		t2.start();
		mt.run();
		
	}
}
