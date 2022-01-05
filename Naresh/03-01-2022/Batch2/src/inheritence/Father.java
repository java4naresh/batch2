package inheritence;

public class Father extends GrandFather{
	
    String fname;
	
	int fage;
	
	float fheight;
	
	String surName;

	/*public Father() {
		System.out.println("Father 0 Cons");
	}*/
	
	public Father(String name, int age, float height, String surName, String gfName, int gfAge, float gfHeight) {
		super(gfName, gfAge, gfHeight);
		this.fname = name;
		this.fage = age;
		this.fheight = height;
		this.surName = surName;
		System.out.println(name+" "+age+" "+height);
	}
	
	public String getSurName() {
		return surName;
	}
	
	public String getFDesignation() {
		return "Businessman";
	}

	@Override
	public String toString() {
		return "Father [fname=" + fname + ", fage=" + fage + ", fheight=" + fheight + ", surName=" + surName
				+ ", gfName=" + gfName + ", gfAge=" + gfAge + ", gfHeight=" + gfHeight + "]";
	}
	
}
