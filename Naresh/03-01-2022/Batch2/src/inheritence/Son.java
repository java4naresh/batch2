package inheritence;

public class Son extends Father {
	
	String name;
	
	int age;
	
	float height;

	/*public Son() {
		super();
		System.out.println("Sun 0 cons");
	}*/
	
	public Son(String name, int age, float hieght, String fatherName, int fAge, float fHieght,String surName, String gfName, int gfAge, float gfHeight) {
		super(fatherName, fAge, fHieght, surName, gfName, gfAge, gfHeight);
		this.name = name;
		this.age = age;
		this.height = hieght;
		System.out.println(name+" "+age+" "+height);
	}
	
	public String getName() {
		return super.getSurName()+" "+name;
	}
	
	public String getSDesignation() {
		return "Employee";
	}

	@Override
	public String toString() {
		return "Son [name=" + name + ", age=" + age + ", height=" + height + ", fname=" + fname + ", fage=" + fage
				+ ", fheight=" + fheight + ", surName=" + surName + ", gfName=" + gfName + ", gfAge=" + gfAge
				+ ", gfHeight=" + gfHeight + "]";
	}
	
	
}
