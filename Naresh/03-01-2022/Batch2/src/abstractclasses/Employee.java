package abstractclasses;

import oops.interfaceexamples.CompanyStandards;

public abstract class Employee implements CompanyStandards {

	String employeeType;
	
    public Employee(String employeeType) {
    	this.employeeType = employeeType;
    	System.out.println(employeeType);
    }
	
	public void work() {
		//System.out.println(employeeType);
		System.out.println(employeeType+" common work");
	}

	
	public void workDaysInWeek() {
		System.out.println(employeeType+" "+5);
	}

}
