class CharAscending 
{
	public static void main(String[] args) 
	{
		char[]ch={'A','F','D','C','E','G','B','H','I','X','P','Q','S','R','V','T','U','W','Z','Y','O','N','M','L','K','J',};
            
		 int tem=0;
		 for (int i=0;i<ch.length;i++)
		{
			 for (int a=i+1;a<ch.length;a++ )
			 { 
              if (ch[i]>ch[a]){
				  tem=ch[i];
			      ch[i]=ch[a];
			      ch[a]=(char) (tem);
			 }
			 }
			 System.out.print(ch[i]+",");  

		 }
		 
	}
}
