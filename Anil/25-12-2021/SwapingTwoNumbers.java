public class SwapingTwoNumbers {
	public static void main(String args[]) {
		int a = 67;
		int b = 96;
		System.out.println("before swapping the values is " + a + " " + b);
		/*int temp;
		temp= a;//67
		a=b;  //97
		b= temp;//67
		System.out.println("after swapping the value is " + a  + " "+ b);*/
		// using +  -  operator 
		 // a = a+b;
		//  b = a-b;
		 // a = a-b;
		  //System.out.println("after swapping the value is " + a + " " + b);
		  //using mutlification division 
		 // a = a*b;
		//  b = a/b;
		//  a= a/b;
		//  System.out.println("after swapping the value is " + a + " " + b);
		 // using single satement
		  b = a+b-(a=b);
		  System.out.println("after  swapping the values is " + a + " " + b);
		  
	}

}
