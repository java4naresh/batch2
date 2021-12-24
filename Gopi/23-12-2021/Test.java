class  Test
{
	public static void main(String[] args) 
	{
		int num=16;
			int sum=0;
		for (int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
			if (sum==num)
			{
				System.out.println("given number is perfact");
			}
			else if (sum>num)
			{
				System.out.println("given number is Abudant");
			}
			else if (sum<num)
			{
            System.out.println("given number is deficient");
			}
		
		
	}
}