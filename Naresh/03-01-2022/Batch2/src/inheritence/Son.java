package inheritence;

public class Son extends Father {
	
	String name;
	
	int age;
	
	float height;

	public Son() {
		super();
		System.out.println("Sun 0 cons");
	}
	
	public Son(String name, int age, float hieght, String fatherName, int fAge, float fHieght,String surName) {
		super(fatherName, fAge, fHieght, surName);
		this.name = name;
		this.age = age;
		this.height = hieght;
		System.out.println(name+" "+age+" "+height);
	}
	
	public String getName() {
		return super.getSurName()+" "+name;
	}
}
