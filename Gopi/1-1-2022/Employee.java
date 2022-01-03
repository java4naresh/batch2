class  Employee
{
	public String empId;

	public String empName;

	public String empPhoneNumber;

	public Employee(String empId, String empName, String empPhoneNumber) {
		this.empId = empId;
		this.empName = empName;
		this.empPhoneNumber = empPhoneNumber;
	}

	public void doSomething(Employee e) {
	//this.empId= e1.empId;
	this.empId = e.empId;
	this.empName = e.empName;
	this.empPhoneNumber = e.empPhoneNumber;
	}

	public String toString() {
		return "Employee[empId="+empId+", empName="+empName+", empPhoneNumber="+empPhoneNumber+"]";
	}
}
