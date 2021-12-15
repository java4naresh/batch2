class  ArrayTest2
{
	public static void main(String[] args) 
	{
		/*char chars[] = new char[26];
		for(int i=0;i< chars.length;i++){
			chars[i] = (char)(i+65);
			}

			for(int i=0;i < chars.length;i++){
				System.out.print(chars[i]+",");
			}*/
	
	     char chars[] = new char[26];
		for(int i=chars.length-1;i >= 0;i--){
			chars[i] = (char)(i+65);
			}

			for(int i=chars.length-1;i >=0;i--){
				System.out.print(chars[i]+",");
			}
	
	
	
	
	}

}
