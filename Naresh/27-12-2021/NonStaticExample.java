class NonStaticExample 
{
	String name = "Naresh";//1

     {
	name = "Kambala";//2
	name = getName();//3
	name = getName3();
	}

    public String getName() {
	name = getName2();//4
	return "Kambala Naresh";//7
	}
  
    public String getName2() {
	name = "Hyderabad";//5
	return name;//6
	
	}

	public String getName3() {
	return "Guntur";
	}

	public static void main(String[] args) 
	{
		//System.out.println(name);//
        NonStaticExample nse = new NonStaticExample();
        System.out.println(nse.name);
	}
}
