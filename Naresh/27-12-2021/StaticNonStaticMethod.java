class StaticNonStaticMethod 
{
	int num;
	String name;

    public static String getName() {
	return "String";
	}

	public String getName2() {
	return "String2";
	}

	public static void main(String[] args) 
	{
		String value = StaticNonStaticMethod.getName();
		System.out.println(value);//String
		StaticNonStaticMethod s = new StaticNonStaticMethod();
		String value2 = s.getName2();
		System.out.println(value2);

	}
}
