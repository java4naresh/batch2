package inheritence2;

import inheritence.PublicExample;

public class PublicExampleClient {

	public static void main(String[] args) {
       PublicExample pe = new PublicExample();
       System.out.println(pe.name);
       pe.m1();
	}

}
