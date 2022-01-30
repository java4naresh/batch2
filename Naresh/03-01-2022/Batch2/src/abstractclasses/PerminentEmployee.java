package abstractclasses;

public class PerminentEmployee extends Employee {
	
	public PerminentEmployee(String name, String employeeType) {
		super(employeeType);
	}

	@Override
	public void benchPolicy() {
		System.out.println("NoTermination");
	}

	@Override
	public void annualLeaves() {
		System.out.println(30);
	}

}
