class DoWhileTest 
{
	public static void main(String[] args) 
	{
		/*int i = 1;
		do
		{
			System.out.println(i);
			i++;
		}
		while (i<0);*/

		int num = 101;
		int temp = num;
		int rev = 0;
		do
		{
			int rem = num%10; // 5
		    num = num / 10; // 52
		    rev = (rev*10)+rem;//5
		}
		while (num != 0);
		System.out.println(rev);
		if(temp == rev) System.out.println("Polindrome");
		else System.out.println("Not Polindrome");
	}
}
