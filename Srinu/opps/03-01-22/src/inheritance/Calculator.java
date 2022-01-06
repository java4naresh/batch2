package inheritance;

public class Calculator {

	public int sum(int num1,int num2){
		int sum=num1+num2;
     return sum;
}
	public void sumPrint(int num1,int num2,int num3){
		
		int sum=num1+num2+num3;
		System.out.println(sum);
}
}
 	class SubCalculator extends Calculator {
		
		public static int  multication(int num1, int num2) {
			int mul = num1*num2;
			return mul;
			
		}
		public void multicationPrint(int num1,int num2) {
			int mul = num1*num2 ;
			System.out.println(mul);
		}
 	}
		
		class  Sub extends SubCalculator{
			
			
		
}
