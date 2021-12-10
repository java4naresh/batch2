class PolindromeTest 
{
	public static void main(String[] args) 
	{
		int num = 121;
		int temp = num;
		int rev = 0;
		int rem = num%10; // 5
		num = num / 10; // 52
		rev = (rev*10)+rem;//5
		while(num != 0) {
		rem = num % 10;//5
		num = num / 10;//0
		rev = (rev*10)+rem;//520+5
		
		}
		System.out.println(rev);
		if(temp == rev) System.out.println("Polindrome");
		else System.out.println("Not Polindrome");
	}
}