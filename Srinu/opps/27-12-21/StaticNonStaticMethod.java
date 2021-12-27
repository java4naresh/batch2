class StaticNonStaticMethod  
{
	int num;
	String name="srinivas";
    float price=1200.00f;

	public static String getname(){
    
 return "srinivas";
	}
public String getname1(){
    
 return "Anil ";
}
public char gender(){
    
 return 'M';
}
public static char gender1(){
    
 return 'M';
}
public int  value(){
    
 return 100;
}
	public static void main(String[] args) 
	{
		String name=StaticNonStaticMethod.getname();
		System.out.println(name);
		//String name1=StaticNonStaticMethod.getname1();
		//System.out.println(name1);
        StaticNonStaticMethod sns=new StaticNonStaticMethod();
		String name1=sns.getname1();
		System.out.println(name1);
		char gd=sns.gender();
		System.out.println(gd);
		char ch=StaticNonStaticMethod.gender1();
         System.out.println(ch);
		 //char ch=StaticNonStaticMethod.gender();
          int result=sns.value();
		   System.out.println(result);

		
	

	}
}
