class  PolindromeTest
{
	public static void main(String[] args) 
	{
		int number = 409;
		int tem = number;
		int polindrome = 0;
		do
		{
		   int rem = number%10;
		   number = number/10;
		   polindrome = (polindrome*10)+rem;
		}
		while (number!=0);
		if(tem==polindrome){
			System.out.println(tem+"is polindrome");

		}
		else {
			System.out.println(tem+"is not polindrome");
		}
	}
}
