class Calculator
{
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
public static int sum1(int num1,int num2){
	int sum=num1+num2;
	return sum;

}
static void  sum2(int num1,int num2){
	int sum=num1+num2;
	System.out.println(sum);

}

}
