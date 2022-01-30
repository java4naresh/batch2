package inheritence;

public class Parent {
	
	String surName;
	
	public Parent(String surName) {
		System.out.println(surName);//
		System.out.println("Parent Cons");
		this.surName = surName;
	}
	
	public Parent() {
		System.out.println("Parent 0 cons");
	}
	
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
