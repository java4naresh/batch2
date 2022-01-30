package polymorphism;

public class ArithmeticOperations {
	
	public static void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}
	
	public static void mul(int num1, int num2, int num3) {
		System.out.println(num1*num2*num3);
	}
	
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	public void add(int num1,int num2,int num3,int num4) {
		System.out.println(num1+num2+num3+num4);
	}
	
	public static void main(String[] args) {
		ArithmeticOperations.mul(10, 20);
		ArithmeticOperations.mul(10,20,5);
		ArithmeticOperations ao = new ArithmeticOperations();
		int sum = ao.add(10, 20);
		System.out.println(sum);
		sum = ao.add(10, 20, 30);
		System.out.println(sum);
		ao.add(10, 20,  30, 40);
	}

}
