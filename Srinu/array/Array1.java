class Array1 
{
	public static void main(String[] args) 
	{ //(A,B,C,D,.....Z)
		/*char [] ch=new char[26];
		for (int i=0;i< ch.length;i++ )
		{
			ch[i]= (char)(i+65);
		}
       for (int i=0;i< ch.length;i++ ){
		   
		   System.out.print(ch[i]+ ", ");
	}  
	System.out.println(ch.length);*/
	/*char [] ch=new char[26];
		for (int i=ch.length-1;i>=0;i-- )
		{
			ch[i]= (char)(i+65);
		}
       for (int i=ch.length-1;i>=0;i-- ){
		   
		   System.out.print(ch[i]+ ", ");*
	}*/
	char [] ch=new char[26];
		for (int i=0;i< ch.length;i++ )
		{
			ch[i]= (char)(64+26-i);
		}
       for (int i=0;i< ch.length;i++ ){
		   
		   System.out.print(ch[i]+ ", ");
	}
}
}