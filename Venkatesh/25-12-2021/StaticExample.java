class StaticExample
{
	public static void main(String[] args) 
	{
		System.out.println(num);
        StaticExample se = new StaticExample();
		se.num2 = 8000;
		StaticExample se2 = new StaticExample();
		System.out.println(se.num2);//8000,
		System.out.println(se2.num2);//3000,
	}

    static int num = getNum();

	int num2 = getNum2();

	public static int getNum() {
		System.out.println("getNum");
	    return 25;
	}

	public int getNum2() {
		System.out.println("getNum2");
	    return 10;
	} 

	{
	System.out.println(num2);
	num2 = 20;
	
	}

    {
	System.out.println(num2);
	num2 = 3000;
	
	}

    
    
	static {
	System.out.println(num);
	num = 20;
	}

	static {
	System.out.println(num);
	num = 30;
	}

	
}
