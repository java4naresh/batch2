class FloatAscendening 
{
	public static void main(String[] args) 
	{
		/*float[] ch={100.25f,100.05f,100.12f,100.09f,100.20f,100.23f};
           
		  float tem=0;
		  for (int i=0;i<ch.length;i++)
		  {
			  for (int a=i+1;a<ch.length;a++)
			  {
				  if(ch[i]>ch[a])
				  {
					  tem=ch[i];
					  ch[i]=ch[a];
					  ch[a]= (float)(tem);
				  }
			  }
              System.out.print(ch[i]+",");
		  }*/

		  float[] ch={100.25f,100.05f,100.12f,100.09f,100.20f,100.23f};
           
		  float tem=0;
		  for (int i=0;i<ch.length;i++)
		  {
			  for (int a=i+1;a<ch.length;a++)
			  {
				  if(ch[i]<ch[a])
				  {
					  tem=ch[i];
					  ch[i]=ch[a];
					  ch[a]= (float)(tem);
				  }
			  }
              System.out.print(ch[i]+",");
		  }

 
		
	}
}
