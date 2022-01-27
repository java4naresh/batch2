package wrapperClasses;

public class Variables {

	private String name;
	private int age;
	private char gender;
	private long number;
	private float weight;
	private double salary;
	public Variables(String name,int age,char gender,long number,float weight,double salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
		this.weight = weight;
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
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public float getWeight() {
			return weight;
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
					+ ", weight=" + weight + ", salary=" + salary + "]";
		}
	
		
}
