//import java.util.*;
class  ArrayTest1
{
	public static void main(String[] args) 
	{
		int numbers[] = new int[100];
       // System.out.print(Arrays.toString(numbers);
       
       /* for(int i=0;i<numbers.length;i++){
			numbers[i] = i+10;
       
		  System.out.println(i);
		}

	    for(int i=0;i<numbers.length;i++){
	
	     System.out.println(numbers[i]+",");
	
		}*/
	
	
	    for(int i=numbers.length-1;i>=5;i--){
			numbers[i] = i+1;
		}
	
	
	      for(int i=numbers.length-1;i>=0;i--){
	
	     System.out.print(numbers[i]+",");
	
		  }
	
	
	
	
	}

}
