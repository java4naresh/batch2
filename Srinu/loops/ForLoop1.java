class ForLoop1 
{
	public static void main(String[] args) 
	{
		int d=1;
		int fact=1;
		int num=10;
		
		for(d=1;d<=num;d++){
			
         fact= fact*5;
		 System.out.println(fact);
		}

		for(d=1;d<=num;d++){
			
        fact=fact*d;  
		}
	    System.out.println(fact);
   /*   int num =5;
	  int d=1;
	  int primecheck=0;
	  for(d=1;d<5;d++){
	
	    if(num%2==0){
		
		 primecheck=1;
		break;
			}
	  }
        if(primecheck==0){
			
         System.out.println(num+"  is prime number");
        } 
		else{
		 System.out.println(num+"  is not prime number");	
        }
		
		
		
		
	/*	for (int d=3;d<100;d++){
				int primecheck=0;
	
        for (int i=2;i<d;i++){
          if (d%i==0){ 
			  
			 primecheck=1;

			 break;
		  }
          }if (primecheck==0){
			  System.out.println(d+" is a prime number");
          
          }else{
			System.out.println(d+" is not a prime number");
          }

        

		}*/
		
				
		      
        
	 
		
	}
}
