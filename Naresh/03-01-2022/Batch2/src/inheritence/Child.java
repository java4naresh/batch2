package inheritence;

public class Child extends Parent {
	
	String name;
	
	String home = "2 bhk";
	
	public Child() {
		System.out.println("Child Cons");
	}
	
	public Child(String surName, String name) {
		super(surName);
		this.name = name;
	}

	public void m3() {
		System.out.println("m3");
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", home=" + home + "]";
	}
	
	
}
