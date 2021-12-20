public class AssendingOrder {
	public static void main(String args[]) {
		int []arr= new int[] {56,84,22,77,96,23,85};
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	int temp;
	for(int i=0;i<arr.length;i++) {
		for (int j=i;j<arr.length;j++) {
			if (arr[i]>arr[j]) {
				 temp= arr[i];
				arr[i]= arr[j];
			     arr[j]= temp;
			}
		}
	}
	for(int a:arr) {
		System.out.println("ofter assending order is" + a);
	}
	}

}