class StaticExample 
{

    
   
    static int num = 10;

	int num2 = 20;
	

	static {
		System.out.println(num);
		//System.out.println(num2);
	    System.out.println("Static Block");
	}

    

	static {
		System.out.println(num);
		//System.out.println(num2);
	    System.out.println("Static Block2");
	}

	{
		System.out.println(num);
		System.out.println(num2);
	    System.out.println("Non Static Block");
	}

	

	{
		System.out.println(num);
		System.out.println(num2);
	    System.out.println("Non Static Block2");
	}

 
	


	public static void main(String[] args) 
	{
		StaticExample se = new StaticExample();
		StaticExample se2 = new StaticExample();
		StaticExample se3 = new StaticExample();
		StaticExample se4 = new StaticExample();
	}
}
