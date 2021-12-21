class FactSum1
{
	public static void main(String[] args) 
	{
		 long fact=1l;
	  long sum=0l;
	  int num=25;
	  for (int i=1;i<=num;i++)
	  {
		  
		  
			  fact=fact*i;
			  sum=sum+fact;
		    System.out.println("fact of"+" "+i+"="+fact);
			
		
	  }
	  System.out.println("=====");
	    System.out.println(sum);
	   
		
	}
}
