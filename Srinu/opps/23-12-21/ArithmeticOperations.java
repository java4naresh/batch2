class ArithmeticOperations 
{
	public static void main(String[] args) 
	{
		ArithmeticOperations ao=new ArithmeticOperations();
		//int result=ao.sum(10,25);
		//System.out.println(result);
		//System.out.println(ao.sum(10,25));
		//ao.sumPrint(10,15,25);
      // System.out.println(ao.multiplicatin(12,5,20));
	  // ao.multiplicatinPrint(10,20,5);
	  // System.out.println(ao.substraction(25,10,15));
	   //ao.substractionPrint(10,15,10);
       System.out.println(ao.div(10,2));
	   ao.divPrint(20,10); 
	   System.out.println(ao.rem(10,3));
	   ao.remPrint(10,2);
	}
	public int sum(int num1,int num2){
		int sum=num1+num2;
     return sum;
}
public void sumPrint(int num1,int num2,int num3){
	
	int sum=num1+num2+num3;
	System.out.println(sum);
}
public long multiplicatin(int num1,int num2,int num3){
	
int mul= num1*num2;
int mult=mul-num3;

return mult;

}
public void multiplicatinPrint(int num1,int num2,int num3){ 
	int mul=num1*num2-num3;
		System.out.println(mul);
}
public int substraction(int num1,int num2,int num3){
	int sum=num1-num2;
int sub=sum+num3;
return sub;
}
public void substractionPrint(int num1,int num2,int num3){
	int sum= num1+num2;
	int sub=sum-num3;
	System.out.println(sub);
	return;
}


	public int div(int num1,int num2){
	if (num1==0||num2==0) return 0;
	
    return num1/num2;

}
public void divPrint(int num1,int num2){
	if (num1!=0||num2!=0) {
	System.out.println(num1/num2);
	
	}


}
public int rem(int num1,int num2){
	if (num1==0||num2==0) return 0;

   return num1%num2;
}
public void remPrint(int num1,int num2){
	
if (num1!=0||num2!=0){

System.out.println(num1%num2);
}
}
	
}