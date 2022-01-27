package wrapperClasses;

public class RegistrationForm {

	private String name;
	private Integer age;
	private Charcter gender;
	private long number;
	private Float hight;
	private Double salary;
	public Variables(String name,int age,char gender,long number,float hight,double salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
		this.hight = hight;
		this.salary = salary;
	}
	
	
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		} 
		
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public char getGender() {
			return gender;
		}
		public void setNumber(long number) {
			this.number = number;
		}
		public long getNumber() {
			return number;
			
		}
		public void setHight(float hight) {
			this.hight = hight;
		}
		public float getHight() {
			return hight;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getSalary() {
			return salary;
		}
		@Override
		public String toString() {
			return "Variables [name=" + name + ", age=" + age + ", gender=" + gender + ", number=" + number
					+ ", hight=" + hight + ", salary=" + salary + "]";
		}
	
		
}