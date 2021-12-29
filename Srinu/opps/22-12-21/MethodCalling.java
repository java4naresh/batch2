class MethodCalling 
{
	public static void main(String[] args) 
	{
	      MethodCalling mc=new MethodCalling();
	    // long result= mc.findFactorial(5l);
		  //System.out.println(result);
		  //long result2= mc.findFactorial(10l);
		 // System.out.println(result2);
		  //mc.findFactorialAndPrint(5l);
		 // mc.findFactorialAndPrint(10l);
		   // String result= mc.isOwel('a');//method calling one type
			System.out.println(mc.isOwel('b'));//method calling one type
			//System.out.println(result);
			
	}
   public long findFactorial(long input){
	   long fact=1;
	   for (int i=1;i<=input;i++)
	   {
		   fact=fact*i;
	   }
   return fact;
	   
  }
  public void findFactorialAndPrint(long input){
      long fact1 =1;
	  for (int i=1;i<=input;i++)
	  {
		  fact1=fact1*i;
			 System.out.println(fact1);

	  }
  }
 public String isOwel(char input){
          char ch=input;
	   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        
	   return ("owel");
	   }else {
		   return ("not owel");
	   }
	  }
	 

	  }
