package stringClass;

public class StringClass {

	public static void main(String[] args) {
		
		String name = "VENKATESH";
		String name2 = "VENKATESH";
		System.out.println(name);
		String name1 = new String("ASULA");
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