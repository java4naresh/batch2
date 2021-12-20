public class DuplicateElementsEx {
	public static void main(String args[]) {
		
	
	String arr[]= {"java","python","c#","java","ruby","c#"};
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("duplicate elements is :"+ arr[j]);
			}
		}
		
	}

}
}
