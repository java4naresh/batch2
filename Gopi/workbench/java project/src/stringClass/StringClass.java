package stringClass;

public class StringClass {

	public static void main(String[] args) {
		
		String name = "GOPI";
		String name2 = "GOPI";
		System.out.println(name);
		String name1 = new String("NADH");
		System.out.println(name1);
		/*if(name==name2) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}*/
		if(name.equals(name1)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
			
		

	}

}
