import java.util.*;

class  ArrayRowsChange
{
	public static void main(String[] args) 
	{
		int[][] numbers = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		/*numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[0][2] = 3;
		numbers[0][3] = 4;
		numbers[1][0] = 5;
		numbers[1][1] = 6;
		numbers[1][2] = 7;
		numbers[1][3] = 8;
		numbers[2][0] = 9;
		numbers[2][1] = 10;
		numbers[2][2] = 11;
		numbers[2][3] = 12;
         
         System.out.println(numbers[0][0]);
		 System.out.println(numbers[0][1]);
		 System.out.println(numbers[0][2]);
		 System.out.println(numbers[0][3]);
		 System.out.println(numbers[1][0]);
		 System.out.println(numbers[1][1]);
		 System.out.println(numbers[1][2]);
		 System.out.println(numbers[1][3]);
		 System.out.println(numbers[2][0]);
		 System.out.println(numbers[2][1]);
		 System.out.println(numbers[2][2]);
		 System.out.println(numbers[2][3]);*/
		
		//System.out.print(Arrays.length (numbers[][]));
	        // int temp = 0;
	       /*for(int i=2;i>=0;i--){
                 
			for(int j=2;j>=0;j--){
				if(i==numbers.length-1){
				 int temp = numbers[i][j];
					numbers[i][j] = numbers[0][j];
					numbers[0][j] = temp;
				}
			  }	
		   }
		   
           System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));*/



          for(int i=0;i<numbers.length;i++){
			for(int j=0;j<numbers[i].length;j++){
				if(i==numbers.length-2){
					int temp = numbers[i][j];
					numbers[i][j] =numbers[2][j];
					numbers[2][j] = temp;	
				}
			}
          }
         System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));

			
	}
}
