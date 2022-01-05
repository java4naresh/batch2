package inheritance;

public class Son extends Father {
	String name;
	int age;
	float weight;
	
	
	public Son(String name,int age,float weight,String fName,int fAge,float fWeight,String gName,int gAge,float gWeight,String gSurName) {
		super(fName,fAge,fWeight,gName,gAge,gWeight,gSurName);
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println(name+" "+age+" "+weight+" "+surName);
	}
	public String getNum() {
		return super.getNum1();
	}

	
}
