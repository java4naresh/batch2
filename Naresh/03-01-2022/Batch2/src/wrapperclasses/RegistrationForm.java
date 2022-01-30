package wrapperclasses;

public class RegistrationForm {
	
	private String name;
	
	private Integer age;
	
	private Character gender;
	
	private Float height;
	
	private Double weight;
	
	private Long salary;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegistrationForm [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height
				+ ", weight=" + weight + ", salary=" + salary + "]";
	}

}
