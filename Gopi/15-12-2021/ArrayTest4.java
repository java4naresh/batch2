class  ArrayTest4
{
	public static void main(String[] args) 
	{
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
	
	 /* int highest = 0;
	for(int i=0;i< numbers.length;i++){
		if(highest< numbers[i]) highest = numbers[i];

	}*/
	         int lowest= 38;
	for(int i=0;i< numbers.length;i++){
		if(lowest > numbers[i]) lowest = numbers[i];
	}
	
	  System.out.println(lowest);
	
	  
	
	}
}
