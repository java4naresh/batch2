class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int number = 5;
		int primeCheck = 0;
        
		for(int i=2;i<number;i++) {
		 if(number % i == 0) {
			 //flag = false;
             primeCheck = 1;
			 break;
		  } 
		}

		if(primeCheck == 0) {
		System.out.println(number+" is prime");
		} else {
		System.out.println(number+" is not prime");
		}
	}
}
