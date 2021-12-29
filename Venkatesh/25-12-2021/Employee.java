class Employee 
{

	String name;

    char gender;

	String designation;

	String empId;

	// has A relation
	Address add;

	public Employee(String nm, char g,String des,String em,Address ad) {
	 name = nm;
	 gender = g;
     designation = des;
	 empId = em;
	 add = ad;
	}


	public static void main(String[] args) 
	{
		Address ad = new Address("Gnplm","Gnplm", "Bellamkonda", "Guntur", "AP", 522411);
		Employee emp = new Employee("Venkatesh",'M', "Application Developer", "123456",ad);
		Employee emp2 = new Employee("Priya",'F',"Associate", "54445",a);
        System.out.println(emp.name+" "+emp.gender+" "+emp.designation+" "+emp.empId+" "+emp.add.address1+" "+emp.add.address2+" "+emp.add.mandal+" "+emp.add.city+" "+emp.add.state+" "+emp.add.pincode+" "+emp.add.country);
		System.out.println(emp2.name+" "+emp2.gender+" "+emp2.designation+" "+emp2.empId+" "+emp2.add.address1+" "+emp2.add.address2+" "+emp2.add.mandal+" "+emp2.add.city+" "+emp2.add.state+" "+emp2.add.pincode+" "+emp2.add.country);
	}
}
