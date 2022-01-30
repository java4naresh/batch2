package oops.interfaceexamples;

public class InterfaceClient {

	public static void main(String[] args) {
         MyInterface mi = new MyImplementation();
         int sum = mi.add(10, 20);
         System.out.println(sum);
         int mul = mi.multiply(20, 20);
         System.out.println(mul);
         MyInterface mi2 = new MyImplementation2();
         int sum2 = mi2.add(10, 20);
         System.out.println(sum2);
         int mul2 = mi2.multiply(20, 20);
         System.out.println(mul2);
	}

}
