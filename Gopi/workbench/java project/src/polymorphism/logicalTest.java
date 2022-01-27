package polymorphism;

public class logicalTest {

	public static void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public static void mul(int num1, int num2,int num3) {
		System.out.println(num1*num2*num3);
	}
	public  void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public  void add(int num1, int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public int  add(int num1, int num2,int num3,int num4) {
		return num1+num2+num3+num4;
	}
	public int add(int num1, int num2,int num3,int num4,int num5) {
		return num1+num2+num3+num4+num5;
	}
	
	public static void main(String[] args) {
		logicalTest.mul(3,4);
		logicalTest.mul(3,4,5);
		logicalTest lt = new logicalTest();
		lt.add(2, 3);
		lt.add(2, 3,5);
		int sum = lt.add(1, 2, 3, 4);
		System.out.println(sum);
		int sum1 = lt.add(1, 2, 3, 4,5);
		System.out.println(sum1);
	}
	
	
}
