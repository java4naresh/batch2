package inheritence;

public class Father {
	
    String fname;
	
	int fage;
	
	float fheight;
	
	String surName;

	public Father() {
		System.out.println("Father 0 Cons");
	}
	
	public Father(String name, int age, float height, String surName) {
		this.fname = name;
		this.fage = age;
		this.fheight = height;
		this.surName = surName;
		System.out.println(name+" "+age+" "+height);
	}
	
	public String getSurName() {
		return surName;
	}
	
}
