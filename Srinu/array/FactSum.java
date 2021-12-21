import java.math.BigInteger;
class FactSum
{
	public static void main(String[] args) 
	{
		/*int S=1;
int num=10;
int fact=1;
for(S=1;S<=num;S++){
fact=fact*S;//6*4

}
System.out.println(fact);*/
   
   int num=100;

		BigInteger factorial=BigInteger.ONE;
       BigInteger sum=BigInteger.ZERO;
		for (int i=1;i<=num;i++)
		{
        factorial=factorial.multiply(BigInteger.valueOf(i));
		sum=sum.add(factorial);
        
		System.out.println("factorial of"+i+"="+factorial);
		System.out.println();
		
		}
      System.out.println("sum of 1to"+num+"="+sum);
	/*  long fact=1l;
	  long sum=0l;
	  int num=25;
	  for (int i=1;i<=num;i++)
	  {
		  
		  
			  fact=fact*i;
			  sum=sum+fact;
		    System.out.println("fact of"+" "+i+"="+fact);
			
		
	  }
	  System.out.println("=====");
	    System.out.println(sum);*/
	   
	}
}
