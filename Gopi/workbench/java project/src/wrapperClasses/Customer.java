package wrapperClasses;

public class Customer {

	
	public static void main(String[] args) {
		WrapperTest wt = new WrapperTest();
		System.out.println(wt);
		//Integer num = 10;//literal
		//System.out.println(num);
		String strNumber = "100";
		
		/*Integer num2 = new Integer (strNumber);// object creation
		Float f = new Float(strNumber);
		Long l = new Long(strNumber);
		Double d = new Double(strNumber);
		//Character c = new Character(strNumber);
		System.out.println(num2);
		System.out.println(f);
		System.out.println(l);
		System.out.println(d);*/
		//Integer i = Integer.compare(2,5);
     // Integer i = Integer.max(5, 10);
		//Integer i = Integer.getInteger( null, 7);
     // System.out.println(i);
		//Float f =  Float.sum(1, 5);
		int c =  Character.compare('A','C');
		System.out.println(c);
      
      
	}
}
