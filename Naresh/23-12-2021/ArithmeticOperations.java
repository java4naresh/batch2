class ArithmeticOperations 
{

   public static void main(String[] args) 
	{
		ArithmeticOperations ao = new ArithmeticOperations();
		/*int sum = ao.sum(10,20,30);
		System.out.println(sum);//60
		//System.out.println(ao.sum(10,20,30));//60
		ao.doSumAndPrint(20,50);//70
		long mul = ao.multiplication(10,20);
		System.out.println(mul);//200
		ao.doMultiplicationAndPrint(50,20);//1000
        ao.doSubAndPrint(30,20,40);//10
		int sub = ao.substraction(30,20,40);
		System.out.println(sub);//10*/
		int div = ao.div(17,3);//5
		System.out.println(div);
		ao.doDivAndPrint(15,5);
		int rem = ao.rem(10,0);
		System.out.println(rem);

	}

	public int sum(int num1, int num2, int num3) {
	
	return num1+num2+num3;
	
	}

	public void doSumAndPrint(int num1, int num2) {
	
    System.out.println(num1+num2);
	
	}

	public long multiplication(int num1, int num2) {
	return (long)(num1*num2);
	} 

	public void doMultiplicationAndPrint(int num1,int num2) {
	System.out.println(num1*num2);
	return;
	}

	public int substraction(int num1, int num2, int num3) {
	int sum = num1 + num2;
	int sub = sum - num3;
	System.out.println(sub);
	return sub;
	}

	public void doSubAndPrint(int num1, int num2, int num3) {
	int sum = num1 + num2;
	int sub = sum - num3;
	System.out.println(sub);
	return;
	}

	public int div(int num1, int num2) {
		if(num1 == 0 || num2 == 0) return 0;
	    return num1/num2;
	}

	public void doDivAndPrint(int num1, int num2) {
	int div = num1/num2;
	System.out.println(div);
	}

	public int rem(int num1, int num2) {
        if(num1 == 0 || num2 == 0) return 0;
	    return num1 % num2;
	}

	public void doRemAndPrint(int num1, int num2) {
	System.out.println(num1%num2);
	}


}
