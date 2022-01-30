package polymorphism;

public class MyFirstPolymorphism {
	
	public void m1() {
		System.out.println("m1()");
	}
	
	public void m1(String name) {
		System.out.println("m1(String name)");
	}
	
	public void m1(String name, int age) {
		System.out.println("String name, int age");
	}
	
	public int m1(int age) {
		System.out.println("m1(int age)");
		return age+5;
	}
	
	public static void main(String[] args) {
		MyFirstPolymorphism mfp = new MyFirstPolymorphism();
		int retVal = mfp.m1(10);
		System.out.println(retVal);
	}
}
