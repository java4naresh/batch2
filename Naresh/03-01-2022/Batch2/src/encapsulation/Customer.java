package encapsulation;

public class Customer {
	
	private String name;
	
	private char gender;
	
	private int age;
	
	private long phoneNumber;
	
	private String aadhar;
	
	private String pan;

	public Customer(String name, char gender, int age, long phoneNumber, String aadhar, String pan) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.aadhar = aadhar;
		this.pan = pan;
	}
	
	//setter method
	public void setName(String name) {
		this.name = name;
	}
	
	//getter method
	public String getName() {
		return this.name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	public String getAadhar() {
		return this.aadhar;
	}
	
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	public String getPan() {
		return this.pan;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", aadhar=" + aadhar + ", pan=" + pan + "]";
	}
	
	

}
