class  DoWhileTest
{
	public static void main(String[] args) 
	{    
		int num =153;
		int tem =num;
		int total = 0;
		 
		do
		{
			 int rem = num%10;
			 num = num/10;
			  total = total+(rem*rem*rem);
			
			
		}
		
		while (num!=0);
		if(tem==total){
		System.out.println(tem+"is	ArmstrongTest");
		}
		else {
		System.out.println(tem+"is not ArmstrongTest");
		}
	}
}
