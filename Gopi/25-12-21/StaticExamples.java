class  StaticExamples
{
	static int num1= findNum();
	int num2 = findNum2();
	
	public static int findNum(){
		System.out.println("AMMA");
		return 15;
	}
	public  int findNum2(){
		System.out.println("DADDY");
		return 54;
	}
	
	
	static String name = "gopinadh()";
	String name1 = "kambala()";
	static{
		System.out.println(name);
		System.out.println(name);
		System.out.println("block");
	}
	{ 
		System.out.println(name);
		System.out.println(name1);
		System.out.println("block2");
	}
	  

	public static void main(String[] args) 
	{
		System.out.println(name);
		System.out.println(num1);
          StaticExamples se=new StaticExamples();
	}
}
