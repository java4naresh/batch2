public class CountNumberOfDigits {
	public  static void main(String args[]) {
		long  num = 12396689;
		int count =0;
		while(num!=0) {
			num = num/10;
			count++;
			
		}
		System.out.println("number of digits in a number " + count);
		
				
		
	}

}
