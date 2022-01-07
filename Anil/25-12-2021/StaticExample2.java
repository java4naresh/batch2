public class StaticExample2 {
	public static void main(String args[]) {
		System.out.println(num);
		StaticExample2 se = new StaticExample2();
		se.num2= 2000;
		StaticExample2 se2 = new StaticExample2();
		System.out.println(se.num2);
		System.out.println(se2.num2);
		
	}
	static int num = getnum();
	  int num2 = getNum2();
	static int getnum() {
		System.out.println("getNum");
		return 25;
	}
	public int getNum2() {
		System.out.println("getNum2");
		return 10;
	}
	{
	System.out.println(num2);
	num2 = 20;
	
	}
	{
	System.out.println(num2);
	num2 = 2555;
	}
	static {
		System.out.println(num);
		num= 1000;
	}
	static {
		System.out.println(num);
		num = 789;
	}
	
	}

