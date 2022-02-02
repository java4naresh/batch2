package polymorphism;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
	
	@Override
	public int hashCode() {
		return 143;
	}
	
	public static void printSomething() {
		System.out.println("Hello Sub Class");
	}

	@Override
	public void service() {
		System.out.println(200);
	}
	
	@Override
	public PerminentEmployee getEmployee() {
		PerminentEmployee pe = new PerminentEmployee("Naresh", "per", "IBM", "Rajesh");
		System.out.println(pe);//
		return pe; 
	}
}
