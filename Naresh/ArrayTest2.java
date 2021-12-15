import java.util.*;

class ArrayTest2 
{
	public static void main(String[] args) 
	{
		//int[] numbers = new int[10];//99
		
		
		  /*           
		for(int i = 0; i < numbers.length; i++ ) {
		
		numbers[i] = i+1;//
		}
        for(int i = 0; i < numbers.length; i++ ) {
		
		System.out.print(numbers[i]+", ");
		}
		*/
        /*for(int i = numbers.length - 1; i >= 0; i-- ) {
		
		numbers[i] = i+1;
		}
		
		for(int i = numbers.length - 1 ; i >= 0; i-- ) {
		
		System.out.print(numbers[i]+", ");
		}*/

		char[] chars = new char[26];

		/*chars[0] = 'A';
        chars[1] = 'B';
		chars[2] = 'C';
		chars[3] = 'D';
		chars[1] = 'B';*/

       /* int index = 0;
		for(int i=65+25; i > 64; i--) {
		chars[index] =  (char)i;//
		System.out.print(chars[index]+", ");
		index++;
		
		}
		for(int i=0; i < chars.length; i++) {
		System.out.print(chars[i]+", ");
		}*/

		int[] values = new int[5];
        values[0] = 10;
		values[1] = 5;
		values[2] = 15;
		values[3] = 12;
		values[4] = 1;
		

        int highest = 0;

		for(int i = 0; i< values.length;i++) {
			//15 < 1
		if(highest < values[i]) highest = values[i];
		}
       System.out.println(highest);
	}
}
