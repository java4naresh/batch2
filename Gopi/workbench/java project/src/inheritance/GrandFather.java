package inheritance;

public class GrandFather {
	String name;
	int age;
	float weight;
	static String surName="Kambala";
	public GrandFather(String name,int age,float weight,String surName) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println(name+" "+age+" "+weight+" "+surName);
	}
	public GrandFather() {
		
		System.out.println("GrandFather");
	}
	public String getNum2() {
		return "KAMBALA GOPINADH";
	}

}
