class Array1 
{
	public static void main(String[] args) 
	{
		String [] ch=new String[10];
		for (int index=0;index< ch.length;index++ )
		{
			ch[index]= "index + 65";
		}
       for (int index=0;index< ch.length;index++ ){
		   System.out.println(ch.length);
		   System.out.println(ch[index]);
	}
}
}