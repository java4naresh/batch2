class ConstructorExample 
{

    String name;
	int num;
	char ch;
	float amount;

	public ConstructorExample() {
	System.out.println("No Arg Constructor");
	}

	/*public ConstructorExample(String name1) {
	name = name1;
	}*/

	public ConstructorExample(String name1,int num1,char ch1,float amount1) {
	name = name1;
	num = num1;
	ch = ch1;
	amount = amount1;
    System.out.println("Parameterzed Constructor");
	}


	public static void main(String[] args) 
	{
		//ConstructorExample ce = new ConstructorExample("Naresh",10,'M', 1000.00f);
		ConstructorExample ce = new ConstructorExample();
		System.out.println(ce.name+" "+ce.num+" "+ce.ch+" "+ce.amount);
	}
}
