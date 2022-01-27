package encapsulation;

public class Details {

	private String name ;
	private int age;
	private char gender;
	private String dob;
	private long number;
	private boolean married;
	
	public  Details(String name,int age,char gender,String dob,long number,boolean married) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.number = number;
		this.married = married;
	}
	public void setName(String name) {
		System.out.println(name);
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		System.out.println(age);
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		System.out.println(gender);
	}
	
	public char getGender() {
		return gender;
	}
	public void setDob(String dob) {
		System.out.println(dob);
	}
	public String getDob() {
		return dob;
	}
	public void setNumber(long number) {
		System.out.println(number);
	}
	public long getNumber() {
		return number;
	}
	public void setMarried(boolean married) {
		System.out.println(married);
	}
	public boolean getMarried() {
		return married;
	}
	
	
}
