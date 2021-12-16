class LowestValue 
{
	public static void main(String[] args) 
	{
		int [] values=new int[10];
         values[0]=5;
		 values[1]=15;
		 values[2]=4;
		 values[3]=10;
		 values[4]=35;
		 values[5]=19;
		 values[6]=30;
		 values[7]=21;
		 values[8]=1;
		 values[9]=17;
		 int lowest=50;
		 for (int i=0;i<values.length;i++)
		 {
			 if (lowest>values[i]) lowest=values[i];
			 
				
			 }
			  System.out.println(lowest);
	}
}
