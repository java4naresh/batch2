class PrimeNumber 
{
	public static void main(String[] args) 
	{
		
		for(int j=1; j<=100; j++){
		int primeCheck = 0;
        int number = j;
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
}
