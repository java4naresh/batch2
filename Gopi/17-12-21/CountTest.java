class  CountTest
{
	public static void main(String[] args) 
	{
		int num[] = {1,3,6,5,7,1,9,5};
		int count=0;
		int count1=0;
		for(int i=0;i<num.length;i++){
			count++;
			for(int j=0;j<num.length;j++){
				count1++;
			}
		}
	
	System.out.println(count);
    System.out.println(count1);
	
	}


}
