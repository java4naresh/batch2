package inheritance;

import inheritance1.PublicExample;

public class PublicExampleClient {
	
	public static void main(String[] args) {
		
		PublicExample pe = new PublicExample ("srinu",9010432734l);
	System.out.println(pe);
	pe.sum(12,10);
	}

}
