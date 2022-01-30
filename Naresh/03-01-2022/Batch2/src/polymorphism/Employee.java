package polymorphism;

public class Employee {
	
	private String companyName;
	
	private String manager;

	public Employee(String companyName, String manager) {
		this.companyName = companyName;
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [companyName=" + companyName + ", manager=" + manager + "]";
	}
	
	

}
