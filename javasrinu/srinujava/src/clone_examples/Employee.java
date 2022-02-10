package clone_examples;

class Employee implements Cloneable {

	private String  name;
	
	private String empid;
	
	private  Integer age;
	
	private Float height;
	
	public Employee() {
		System.out.println("employee");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", age=" + age + ", height=" + height + "]";
	}
	
	
	
}
