class Company 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("002", "Naresh", "91-9951288766");
		Employee emp2 = new Employee("003", "Srinu", "91-9951288755");
		Employee emp3 = new Employee("004", "Gopi", "91-9951288744");
		System.out.println(emp);//002,
		System.out.println(emp2);//002,
        System.out.println(emp3);
		System.out.println("================");
		emp.doSomething(emp2);
		emp3.doSomething(emp2);
        System.out.println(emp);//002,
		System.out.println(emp2);//002,
        System.out.println(emp3);
	}
}
