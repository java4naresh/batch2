package clone_examples;

public class CloneClient {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Naresh");
		Employee emp2 = emp;// shaddow cloning
		System.out.println(emp);
		System.out.println(emp2);
		emp2.setEmpName("Naresh Kambala");
		System.out.println(emp);
		System.out.println(emp2);
	}

}
