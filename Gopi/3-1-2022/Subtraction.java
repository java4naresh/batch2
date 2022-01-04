class Subtraction extends Addition  
{
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
}
