package inheritance;

public class Father extends GrandFather {

	String name;
	int age;
	float weight;
	public Father() {
		super();
		System.out.println("Father");
	}
	public Father(String name,int age,float weight, String gName,int gAge,float gWeight,String gSurName ) {
		super( gName, gAge,gWeight, gSurName);
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println(name+" "+age+" "+weight+" "+surName);
	}
	public String getNum1() {
		return super.getNum2();
	}
}
