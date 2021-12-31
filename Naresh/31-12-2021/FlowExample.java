class FlowExample 
{
	int num3 = getNum3();
	{
	    System.out.println("non static1");
	}
	static{
		System.out.println("static1");
	}

    static int num = getNum();

    static int getNum() {
    System.out.println("getNum");
	return 25;
	}

	static int getNum2() {
	return 25;
	}

    static{
		System.out.println("static2");
	}

	public static void main(String[] args) 
	{
		FlowExample fe = new FlowExample(10);
	}

	public int getNum3() {
		System.out.println("getNum3");
	    return 12;
	}

	public int getNum4() {
	return 13;
	}

	public FlowExample() {
	System.out.println("Cons");
	}

	public FlowExample(int num) {
	System.out.println("Cons2");
	}
}
