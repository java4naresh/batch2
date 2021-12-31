import java.util.Arrays;
class EndUser 
{
	public static void main(String[] args) 
	{
		/*System.out.println(Arrays.toString(args));
		int sum1 = Calculator.addition(10);
		int sum2 = Calculator.addition(10,20,30);
		int sum3 = Calculator.addition(10,20,30,40,50);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);*/
		Sim sim = new Sim("9951288766", "Mini", "Jio", "9951288766");
		Phone phone = new Phone("451", "452", "IPhone", "S20", sim);
		System.out.println(phone.dail(9,9,5,1,2,8,8,7,6));
	}
}
