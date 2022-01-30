package abstractclasses;

public class ContractEmployee extends Employee {
	
	public ContractEmployee(String name, String employeeType) {
		super(employeeType);
	}

	@Override
	public void benchPolicy() {
		System.out.println("Termination");
	}

	@Override
	public void annualLeaves() {
		System.out.println(20);
	}

}
