package inheritence2;

import inheritence.ProtectedExample;

public class ProtectedExampleClient extends ProtectedExample {
	
	public static void main(String[] args) {
		ProtectedExampleClient pec = new ProtectedExampleClient();
		pec.m1();
		System.out.println(pec.name);
	}

}
