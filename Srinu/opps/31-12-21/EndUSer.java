import java.util.Arrays;
class EndUser 
{
	
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(args));
		Calculator cr=new Calculator();
		
		System.out.println(cr.sum(10,15));
		System.out.println(cr.sum(10,15,20));
		System.out.println(cr.sum(10,15,25,40));
        System.out.println(Calculator.sub(45,25,25));
		System.out.println(Calculator.multiplicatin(2,5,10));
		System.out.println(cr.multi(1,2,3,4));
		
	}
}
