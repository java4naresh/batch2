class  LogicalOperation
{
	public int additions(int num1,int num2,int num3){
		int sum = num1+num2+num3;
		return  sum;
	}
	public void doAddAndPrint(int num1,int num2,int num3){
		int sum = num1+num2+num3;
		//System.out.println(sum);
		System.out.println(num1+num2+num3);
	}
	public  int subtraction(int num1,int num2,int num3,int num4){
		int sub = num1-num2;
		int sub1= sub-num3;
		int sub2 = sub1-num4;
		return sub2;
	}
     public void doSubAndPrint(int num1,int num2,int num3,int num4){
		int sub = num1-num2-num3-num4;
         System.out.println(sub);
     }
	 public int multifiction(int num1,int num2){
		int mul = num1*num2;
		return  mul;
	 }
	 public void doMulAndPrint(int num1,int num2){
		System.out.println(num1*num2);
		return;
	 }
	 public float div(int num1,int num2){
		int results =  (num1)/(num2);
		return results;
	 }
	 public  void doDivAndPrint(float num1,float num2){
		System.out.println(num1/num2);
		return;
	 }
	 public double rem(int num1,int num2){
		if(num1==0 || num2==0) return 0;
		else return (double)(num1%num2);
	 }
	 public  void doRemAndPrint(int num1, int num2){
		if(num1==0 || num2==0){
			System.out.println("0");
		}else {
			int total = num1%num2;
			System.out.println ( total);
		}
	 }
}
