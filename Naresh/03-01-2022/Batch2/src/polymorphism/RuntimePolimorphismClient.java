package polymorphism;

public class RuntimePolimorphismClient {

	public static void main(String[] args) {

		SuperClass sc = new SuperClass();
		//Object obj = new SuperClass();
		//sc.service();//100
		SubClass sub = new SubClass();
		sub.service();//200
		SuperClass sc2 = new SubClass();//up casting
		SubClass sub2 = (SubClass) sc2;// down casting
		//Object obj = new SubClass();
		//sc2.service();//200
		SubClass.printSomething();
		sub.getEmployee();
		System.out.println(sub.hashCode());//143
		System.out.println(sc.hashCode());//123
		
	}

}
