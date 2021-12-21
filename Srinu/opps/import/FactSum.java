import java.math.BigInteger;
class FactSum
{
	public static void main(String[] args) 
	{
	

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
	
	}
}
