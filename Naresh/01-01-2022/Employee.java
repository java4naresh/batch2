public class Employee 
{
	public String empId;

	public String empName;

	public String empPhoneNumber;

	public Employee(String empId, String empName, String empPhoneNumber) {
		this.empId = empId;
		this.empName = empName;
		this.empPhoneNumber = empPhoneNumber;
	}

	public void doSomething(Employee emp) {
		//emp = this;
	this.empId = emp.empId;
	this.empName = emp.empName;
	this.empPhoneNumber = emp.empPhoneNumber;
	}

	public String toString() {
		return "Employee[empId="+empId+", empName="+empName+", empPhoneNumber="+empPhoneNumber+"]";
	}
}
