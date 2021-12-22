class LigicalPrograms 
{
	public static void main(String[] args) 
	{
		LigicalPrograms lp = new LigicalPrograms();
		long result = lp.findFactorial(5l);// method calling
		System.out.println(result);
		long result2 = lp.findFactorial(10l);
		System.out.println(result2);
		lp.findFactorialAndPrint(5l);
        lp.findFactorialAndPrint(10l);
		boolean result3 = lp.isArmStrong(153);
		System.out.println(result3);
	}

	public long findFactorial(long input) {
	long fact = 1;
	for(int i=1;i<=input;i++) {
	fact = fact*i;
	}
	return fact;
	}

	public void findFactorialAndPrint(long input) {
	long fact = 1;
	for(int i=1;i<=input;i++) {
	fact = fact*i;
	}
	System.out.println(fact);
	}

	public boolean isArmStrong(int input) {
	    int n = input;
		
        int temp= n;
		int armStrong = 0;
		while(temp != 0) {//1
		int rem = temp % 10;//3,5,1
		temp = temp / 10;//15,1,0
        armStrong = armStrong + (rem*rem*rem);//27+125+1
		
		}
		
		System.out.println(armStrong);
		if(n == armStrong) return true;
		else return false;
		
	}
}
