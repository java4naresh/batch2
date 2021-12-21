class Men {
	String name;
	String colour;
    float weight;
	float height;
	int age;
	boolean marriage;
	double salary;
	public static void main(String[] args) 
	{
       Men m = new Men();
		System.out.println(m.name);
		System.out.println(m.colour);
		System.out.println(m.weight);
		System.out.println(m.height);
		System.out.println(m.age);
		System.out.println(m.marriage);
		System.out.println(m.salary);

		System.out.println("============");

          m.name = " Gopinadh";
		  m.colour = " light red";
		  m.weight = 65.5f;
		  m.height =4.8f;
		  m.age = 24;
		  m.marriage = false;
		  m.salary = 30000.00;
        
		System.out.println(m.name);
		System.out.println(m.colour);
		System.out.println(m.weight);
		System.out.println(m.height);
		System.out.println(m.age);
		System.out.println(m.marriage);
		System.out.println(m.salary);


	}
}
