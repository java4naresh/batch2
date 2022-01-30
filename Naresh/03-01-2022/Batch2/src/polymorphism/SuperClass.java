package polymorphism;

public class SuperClass {
	
	@Override
	public int hashCode() {
		return 123;
	}
	
	public static void printSomething() {
		System.out.println("Hello Super Class");
	}
	
	private void service() {
		System.out.println(100);
	}
	
	public Employee getEmployee() {
		PerminentEmployee pe = new PerminentEmployee("Naresh", "per", "IBM", "Rajesh");
		return pe;
	}

}
