import java.util.*;
class Array2 
{
	public static void main(String[] args) 
	{
/*		int[] numbers=new int[20];
         System.out.println(Arrays.toString(numbers));
		    //(1.2,3,4,5,.....)
			for (int i=0;i<numbers.length;i++)
			{
				numbers[i]=i+1;
			}for (int i=0;i<numbers.length;i++ )
			{
				
		
		   // System.out.println(numbers[i]);
	} System.out.println(Arrays.toString(numbers));*/
			//revese(......,16,17,19,20)
		/*int[] numbers=new int[20];
         System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
			for (int i=numbers.length-1;i>=0;i--)
			{
				numbers[i]=i+1;
			}for (int i=numbers.length-1;i>=0;i--){
				
		
		   // System.out.println(numbers[i]);
	} System.out.println(Arrays.toString(numbers));*/
	//revese(20,19,18,17,.....)
	int[] numbers=new int[20];
         System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
			for (int i=0;i<numbers.length;i++)
			{
				numbers[i]=numbers.length-i;
			}for (int i=0;i<numbers.length;i++){
				
		
		   // System.out.println(numbers[i]);
	} System.out.println(Arrays.toString(numbers));
			}
        
}
