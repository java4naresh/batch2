class StaticExample 
{

    static String name = "Naresh";//1


    static {
	name = "Kambala";//2
	name = getName();//3
	name = getName3();
	}

    public static String getName() {
	name = getName2();//4
	return "Kambala Naresh";//7
	}
  
    public static String getName2() {
	name = "Hyderabad";//5
	return name;//6
	
	}

	public static String getName3() {
	return "Guntur";
	}

	public static void main(String[] args) 
	{
		System.out.println(name);//
	}
}
