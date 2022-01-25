package encapsulation;

public class EncapsulationClient {

	public static void main(String[] args) {
		Details de = new Details("GOPINADH",25,'m',"02-12-1997",9160423363l,false);
		
		System.out.println (de.getName());
		System.out.println (de.getAge());
		System.out.println (de.getGender());
		System.out.println (de.getDob());
		System.out.println (de.getNumber());
		System.out.println (de.getMarried());
		
		
		
	}

	
}
