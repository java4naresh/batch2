class  AscendingOrder
{
	public static void main(String[] args) 
	{
		char[] chars = new char[10];
		chars[0] = 'A';
		chars[1] = 'G';
		chars[2] = 'X';
		chars[3] = 'P';
		chars[4] = 'W';
		chars[5] = 'T';
		chars[6] = 'N';
		chars[7] = 'F';
		chars[8] = 'V';
		chars[9] = 'L';
		char tem = 0;
		for(int i=0;i<chars.length;i++){
			for(int j=i+1;j<chars.length;j++){
                if(chars[i]< chars[j]){
				//if(chars[i]> chars[j]){
					tem = chars[i];
					chars[i] = chars[j];
					chars[j] = tem;
				}
			}
		
		System.out.println(chars[i]+",");
		
		}
		
	}	
}
 