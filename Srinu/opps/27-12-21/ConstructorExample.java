class ConstructorExample    
{
  
  int num;
  String name;
  char ch;
  float amount;
  
    public ConstructorExample  (){
	System.out.println("No Arg Constructor");
   } 
   public ConstructorExample(String name1){
    name=name1;
   System.out.println("Parameterzed Constructor");
}
    public ConstructorExample(int num1){
      num=num1;
    System.out.println("Parameterzed Constructor");
}
 public ConstructorExample(char gender){
      ch=gender;
    System.out.println("Parameterzed Constructor");
}
public ConstructorExample(float amount1){
      amount=amount1;
    System.out.println("Parameterzed Constructor");
}
public ConstructorExample(String name1,int num1,char gender,float amount1){
     
	  name=name1;
	  num=num1;
	  ch=gender;
	  amount=amount1;
    System.out.println("Parameterzed Constructor");
}
public ConstructorExample(int num1,String name1,char gender,float amount1){
       num=num1;
	   name=name1;
	  ch=gender;
	  amount=amount1;
    System.out.println("Parameterzed Constructor");
}
	public ConstructorExample(char gender,int num1,String name1,float amount1){
       num=num1;
	   name=name1;
	  ch=gender;
	  amount=amount1;
    System.out.println("Parameterzed Constructor");

}

public ConstructorExample(float amount1,char gender,int num1,String name1){
       num=num1;
	   name=name1;
	  ch=gender;
	  amount=amount1;
    System.out.println("Parameterzed Constructor");

}
public ConstructorExample(float amount1,String name1,int num1,char gender){
       num=num1;
	   name=name1;
	  ch=gender;
	  amount=amount1;
    System.out.println("Parameterzed Constructor");

}
	public static void main(String[] args) 
	{
    ConstructorExample ce=new ConstructorExample();
    System.out.println(ce.name+" "+ce.num+" "+ce.ch+" "+ce.amount);
	ConstructorExample ce1=new ConstructorExample("srinivas");
	System.out.println(ce1.name+" "+ce1.num+" "+ce1.ch+" "+ce1.amount);
	ConstructorExample ce2=new ConstructorExample(10);
	System.out.println(ce2.name+" "+ce2.num+" "+ce2.ch+" "+ce2.amount);
    ConstructorExample ce3=new ConstructorExample('M');
	System.out.println(ce3.name+" "+ce3.num+" "+ce3.ch+" "+ce3.amount);
    ConstructorExample ce4=new ConstructorExample(1000.00f);
	System.out.println(ce4.name+" "+ce4.num+" "+ce4.ch+" "+ce4.amount);
    ConstructorExample ce5=new ConstructorExample("srinivas",10,'M',1000.00f);
	System.out.println(ce5.name+" "+ce5.num+" "+ce5.ch+" "+ce5.amount);
	ConstructorExample ce6=new ConstructorExample(10,"srinivas",'M',1000.00f);
	System.out.println(ce6.num+" "+ce6.name+" "+ce6.ch+" "+ce6.amount);
	ConstructorExample ce7=new ConstructorExample('M',10,"srinivas",1000.00f);
	System.out.println(ce7.ch+" "+ce7.num+ce7.name+" "+" "+ce7.amount);
    ConstructorExample ce8=new ConstructorExample(1000.00f,'M',10,"srinivas");
	System.out.println(ce8.amount+" "+ce8.num+" "+ce8.name+" "+ce8.ch);
	  ConstructorExample ce9=new ConstructorExample(1000.00f,"srinivas",10,'M');
	System.out.println(ce9.amount+" "+ce9.name+" "+ce9.num+" "+ce9.ch);
	}
	}
	

