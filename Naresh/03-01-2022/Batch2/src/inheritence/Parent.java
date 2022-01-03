package inheritence;

public class Parent {
	
	String land = "5acrs";
	
	void m1() {
		System.out.println("Something m1");
	}
	
	public void m2() {
		System.out.println("Something");
	}
	
	public void m4() {
		m1();
	}

}
