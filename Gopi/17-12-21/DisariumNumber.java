class  DisariumNumber
{
	public static void main(String[] args) 
	{
		int number = 175;
		int temp = number;
		int rem = number%10;
		number = number/10;
		int results = (0*10)+rem;
		while(number!=0){
			rem = number%10;
			number = number/10;
			results = (results*10)+rem;

		}
	     System.out.println(results);
		 
		 int value = results;//571
		 int a= value;
		
		   
		   int num = 0;
		   int b = 0;
           int count = 0;
		   
		   while(results!=0){
			int reminder = results%10;
			results = results/10;
		    count++;
			int mul = 1;
			for(int i=1;i<=count;i++){
			mul = mul*reminder;//1*7*7
             }
			num = num+mul;
				
			}
		   
		  System.out.println(num+",");
	}
}

