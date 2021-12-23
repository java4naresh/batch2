
class ArithmeticOperations 
{

   public static void main(String[] args) 
	{
		ArithmeticOperations ao = new ArithmeticOperations();
		int sum = ao.sum(5,25,40);//70
		System.out.println(sum);
		//System.out.println(ao.sum(5,25,40));//70
		ao.doSumAndPrint(20,50);
		long mul = ao.multiplication(15,10);//150
		System.out.println(mul);
		ao.doMultiplicationAndPrint(70,10);//700
        ao.doSubAndPrint(30,20,40);
		int sub = ao.substraction(50,20,40);//30
		System.out.println(sub);
		float div = ao.div(22,3);//7.333
		System.out.println(div);
		ao.doDivAndPrint(15,5);//3
		int rem = ao.rem(10,0);//0
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

	public  float div(float num1, float num2) {
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

