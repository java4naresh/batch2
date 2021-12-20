import java.util.*;

class MultiDArray 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

		/*System.out.println(arr[0][0]);//1
		System.out.println(arr[0][1]);//2
		System.out.println(arr[0][2]);//3
		System.out.println(arr[1][0]);//4
		System.out.println(arr[1][1]);//5
		System.out.println(arr[1][2]);//6
		System.out.println(arr[2][0]);//7
		System.out.println(arr[2][1]);//8
		System.out.println(arr[2][2]);//9
		arr[2][0] = 10; // valid?
		System.out.println(arr[2][0]);//10*/

		//System.out.println(Arrays.toString(arr[0]));
        
		// To Print the Values
        /*for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
		System.out.print(arr[i][j]+", ");
		}
		//System.out.println(Arrays.toString(arr[i]));
		System.out.println();
		}*/

		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println("========================");

		// Swap Logic
		for(int i=0; i< arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
		if(j == arr[i].length-1) {//2
		int temp = arr[i][j];//arr[0][2] temp = 3 arr[1][2] temp = 6 arr[2][2] temp = 9
		arr[i][j] = arr[i][0];//arr[0][2] = arr[0][0]; arr[1][2] = arr[1][0] arr[2][2] = arr[2][0]
		arr[i][0] = temp;//arr[0][0] = 3  arr[1][0] = 6 arr[2][0] = 9
		}

		} 
		
		}
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));

	}
}
