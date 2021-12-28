class  Static
{       
	 String num = getName();
	static int num1 =15;
	public  String getName(){
		num1 = 29;
	 return "Gopinadh";
	}
	public static void main(String[] args) 
	{    System.out.println(num1);
		Static s = new Static();
		String results = s.getName();
		System.out.println(results);
		System.out.println(num1);

	}
}
