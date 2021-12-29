class ConstructorTest
{    
	String name;
	int num;
	float amount;
	char word;
	double amount2;
	boolean condition;
	public ConstructorTest(){
	 
	  System.out.println("constructor");
      }
	  public ConstructorTest(String name1){
	   name = name1;
	  
      }
	   public ConstructorTest(String name1,int num2){
	   name = name1;
	   num = num2;
	  
      }
	  public ConstructorTest(String name1,int num1,float amount1f ){
		  name = name1;
		  num = num1;
		  amount = amount1f;
		  
	  }
	  public ConstructorTest(String name1,int num1,float amount1f,char word1 ){
		  name = name1;
		  num = num1;
		  amount = amount1f;
		  word = word1;
	  }
	  public ConstructorTest(String name1,int num1,float amount1f,char word1,double amount3){
		  name = name1;
		  num = num1;
		  amount = amount1f;
		  word = word1;
		  amount2 = amount3;
	  }
	  public ConstructorTest(String name1,int num1,float amount1f,char word1,double amount3,boolean condition1 ){
		  name = name1;
		  num = num1;
		  amount = amount1f;
		  word = word1;
		  amount2 = amount3;
		  condition= condition1;
		  //System.out.println("constructor2");
	  }
	public static void main(String[] args) 
	{
         ConstructorTest ct = new ConstructorTest();
		 ConstructorTest ct1 = new ConstructorTest("kambala");
		  System.out.println(ct1.name);
		  ConstructorTest ct2 = new ConstructorTest("kambala",5);
		  System.out.println(ct2.name+","+ct2.num);
		  ConstructorTest ct3 = new ConstructorTest("kambala",5,100.0f);
		  System.out.println(ct3.name+" "+ct3.num+" " +ct3.amount);
		  ConstructorTest ct4 = new ConstructorTest("kambala",5,100.0f,'m');
		  System.out.println(ct4.name+" "+ct4.num+" " +ct4.amount+" "+ct4.word);
		  ConstructorTest ct5 = new ConstructorTest("kambala",5,100.0f,'m',1000.00);
		  System.out.println(ct5.name+" "+ct5.num+" " +ct5.amount+" "+ct5.word+" "+ct5.amount2);
		  ConstructorTest ct6 = new ConstructorTest("kambala",5,100.0f,'M',1000.00,true);
		  System.out.println(ct6.name+" "+ct6.num+" " +ct6.amount+" "+ct6.word+" "+ct6.amount2+" "+ct6.condition);
	}
}
