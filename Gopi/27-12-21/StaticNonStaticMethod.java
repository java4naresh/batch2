class  StaticNonStaticMethod
{

	public static int getNum(){
		return 10;
	}
	public int getNum2(){
		return 20;
	}
	public static String getName(){
		return "gopinadh";
	}
	public String getName2(){
		return "GOPINADH";
	}
	public static float getAmount(){
		return 10.04f;
	}
	public float getAmount2(){
		return 20.13f;
	}

	public static void main(String[] args) 
	{  int results =  StaticNonStaticMethod.getNum();
	System.out.println(results);
	String results1 =  StaticNonStaticMethod.getName();
	System.out.println(results1);
	float results2 =  StaticNonStaticMethod.getAmount();
	System.out.println(results2);

	StaticNonStaticMethod sns = new StaticNonStaticMethod();
       int results3 =  sns.getNum2();
	System.out.println(results3);
	String results4 =  sns.getName2();
	System.out.println(results4);
	float results5 =  sns.getAmount2();
	System.out.println(results5);

	StaticNonStaticMethod sns2 = new StaticNonStaticMethod();
       int results6 =  sns2.getNum2();
	System.out.println(results6);
	String results7 =  sns2.getName2();
	System.out.println(results7);
	float results8 =  sns2.getAmount2();
	System.out.println(results8);
		
		
	}

}
