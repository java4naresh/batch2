class  Company
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("002","Gopinadh","9160423363");
		Employee e1 = new Employee("0023","Srinu","9160423455");
		System.out.println(e);
		System.out.println(e1);
         System.out.println("============");
         e.doSomething(e1);
		 System.out.println(e);
		System.out.println(e1);
	}
}
