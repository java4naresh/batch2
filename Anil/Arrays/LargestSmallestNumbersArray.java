import java.util.Arrays;

public class LargestSmallestNumbersArray {
	public static void main(String args[]) {
		int numbers[]= {10,89,76,9999,777,-657,365,99999};
		int Largest = numbers[0];
		int Smallest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>Largest) {
				Largest = numbers[i];
			}
			else if(numbers[i]<Smallest) {
				Smallest= numbers[i];
			}
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("largest number of array is "+ Largest);
		System.out.println("smallest number is array is "+ Smallest);
	}

}
