class  ArrayTest5
{
	public static void main(String[] args) 
	{
		/*int numbers[] = new int[10];
		numbers[0] = 10;
		numbers[1] = 19;
		numbers[2] = 20;
		numbers[3] = 35;
		numbers[4] = 38;
		numbers[5] = 15;
		numbers[6] = 29;
		numbers[7] = 33;
		numbers[8] = 5;
		numbers[9] = 2;
	   int tem = 0;
	 for(int i=0;i< numbers.length;i++){
		for(int j = i+1;j <numbers.length;j++){
			if(numbers[i]< numbers[j]){
				tem = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = tem;
			}
		}
	 
	 
	  System.out.print(numbers[i]+",");
	 
	 }*/
		
        int numbers[] = new int[10];
		numbers[0] = 10;
		numbers[1] = 19;
		numbers[2] = 20;
		numbers[3] = 35;
		numbers[4] = 38;
		numbers[5] = 15;
		numbers[6] = 29;
		numbers[7] = 33;
		numbers[8] = 5;
		numbers[9] = 2;
	   int tem = 0;
	 for(int i=0;i< numbers.length;i++){
		for(int j = i+1;j <numbers.length;j++){
			if(numbers[i]> numbers[j]){
				tem = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = tem;
			}
		}
	 
	 
	  System.out.print(numbers[i]+",");
	 
	 }
		
  
  
  
  
  } 
	     
		 
}	
	
	
	
	
	
	
	
	
	
	

