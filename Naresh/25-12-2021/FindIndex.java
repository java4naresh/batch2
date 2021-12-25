
import java.util.Arrays;
class FindIndex 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,9,10,25,30,35};
		int target = 40;
        FindIndex fi = new FindIndex();
		int[] targetArr = fi.findIndex(arr,target);
		System.out.println(Arrays.toString(targetArr));
	}

	public int[] findIndex(int[] arr, int target) {
	    int[] targetArr = new int[2];
        for(int i=0;i<arr.length;i++) {
		for(int j=0; j<arr.length;j++) {
		if(i!=j){
		int sum = arr[i] + arr[j];
		if(sum == target) {
		targetArr[0] = i;
        targetArr[1] = j;
		}
		}
		}
		}
		return targetArr;
	}
}
