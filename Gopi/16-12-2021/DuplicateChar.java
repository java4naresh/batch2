import java.util.*;

class  DuplicateChar
{
	public static void main(String[] args) 
	{
		char[] chars = {"A",'D','L','A','D','L',};
		char[] uniqueChars = null;
		char index = 0;
		
		
	for(int i=0;i< chars.length;i++){
			  int count =0;
		  for(int j=0;j< chars.length;j++){
			if(chars[i]==chars[j]) count++;//
		  }
		   if(count==1){
			if(uniqueChars != null){
				char[] tempArray = uniqueChars ;
             uniqueChars = new char[uniqueChars.length+1];
			 for(int k=0;k< tempArray.length;k++){
               uniqueChars[k] = tempArray[k];
			  }
              uniqueChars[uniqueChars.length - 1] = chars[i]; 
			} else {
			 	uniqueChars = new char[1];
                uniqueChars[0] = chars[i]; 
			   }

		}
		}
		
		System.out.println(Arrays.toString(uniqueChars));
		
		

	}
}
      