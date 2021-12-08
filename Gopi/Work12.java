class  ForLoopTest
{
	public static void main(String[] args) 
	{
		
		
		for(int i=3;i<=100;i++)
		{
             int primecheck=0; 
			for(int j=2;j<i;j++)
			{
           
             if(i%j==0)
			{
		    primecheck=1;
			break;
			}
	}if(primecheck == 0)
		{
		System.out.println(i+"is prime");
		    }
			else {
                
			System.out.println(i+"is not prime");
	    
			}
		
		}

	
	}



  }
