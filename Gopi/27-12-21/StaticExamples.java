class StaticExamples 
{    
	static int num = 10;
	int num2 = 20;
	static{
		
		System.out.println(num);
		num = 30;
	}
	{
		num2 = 60;
       System.out.println(num2);
	   num2=50;
	}

	public static void main(String[] args) 
	{
		System.out.println(num);
         StaticExamples  se = new StaticExamples ();
          System.out.println(se.num2);
	}
}
