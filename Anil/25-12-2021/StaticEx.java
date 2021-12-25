public class StaticEx {
	static int a=15;
	int b = 20;
	 static {
            System.out.println(a);
		System.out.println("static methods can be excuted first");	
		
	
	}
	 static {
		 System.out.println("static method can be excuted one ofter one");
	 }
	 {
		System.out.println("non static method ofter static");
		System.out.println(b);
		System.out.println(a);
	}
	public static void main(String args[]) {
		StaticEx obj = new StaticEx();
		StaticEx obj2 = new StaticEx();
		StaticEx se  =  new StaticEx();
	
	}

}
 