package inheritance;

public class CalcultorClient {
	
	public static void main(String[] args) {
		
	

    SubCalculator sc = new SubCalculator ();
	System.out.println(sc.sum(10,15));
	sc.sumPrint(10,15,20);
	System.out.println(SubCalculator.multication(10,5));
	sc. multicationPrint(5,5);
	 Sub s= new  Sub();
	 System.out.println(s.sum(10,15));
	s.sumPrint(12,5,10);
	System.out.println(Sub.multication(10,5));
	s.multicationPrint(5,5);
	}	
	
}
