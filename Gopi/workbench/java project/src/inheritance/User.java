package inheritance;

public class User {
	public static void main(String[] args) {
		
		Subclass sc = new Subclass();
		int results = sc.multifiction(5,7);//35
		sc.doMulAndPrint(9,5);//45
		System.out.println(results);
		int results1 = sc.additions(5,7);//12
		System.out.println(results1);
		sc.doAddAndPrint(1,2,3,4);
		
	}
	
	
	

}
