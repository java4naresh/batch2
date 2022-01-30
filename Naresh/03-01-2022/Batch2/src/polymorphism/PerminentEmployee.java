package polymorphism;

public class PerminentEmployee extends Employee {

	private String empName;
	
	private String type;
	
	public PerminentEmployee(String empName, String type, String companyName,String manager) {
		super(companyName, manager);
		this.empName = empName;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PerminentEmployee [empName=" + empName + ", type=" + type + "]";
	}

}
