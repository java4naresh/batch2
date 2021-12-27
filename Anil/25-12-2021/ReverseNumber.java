public class ReverseNumber {
	public static void main(String args[]) {
		int num= 56789838;
		/*int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("revers number is "+  rev);*/
		// using String buffer class
		/*StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
			System.out.println("revers number is "+  rev);*/
		//using string Bulider class
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev = sb1.reverse();
		System.out.println("revers number is "+  rev);
		
			
		
	}

}
