package oops.interfaceexamples;

public class MyImplementation implements MyInterface {

	public int add(int num1, int num2) {
		System.out.println("add");
		return num1+num2;
	}
	
	public int multiply(int num1, int num2) {
		System.out.println("multiply");
		return num1*num2;
	}

}
