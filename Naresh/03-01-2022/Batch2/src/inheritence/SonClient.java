package inheritence;

public class SonClient {

	public static void main(String[] args) {
       Son s = new Son("Naresh", 30, 5.8f, "Brahmam", 55, 5.5f, "Kambala", "Koteswarao", 90, 5.5f);
       System.out.println(s);
       System.out.println(s.getGFDesignation()); 
       System.out.println(s.getFDesignation());
       System.out.println(s.getSDesignation());
       Father f = new Father("Brahmam", 55, 5.5f, "Kambala", "Koteswarao", 90, 5.5f);
	   System.out.println(f);
	   System.out.println(f.getFDesignation());
	   System.out.println(f.getGFDesignation());
	   GrandFather gf = new GrandFather("Koteswarao", 90, 5.5f);
	   System.out.println(gf);
	   System.out.println(gf.getGFDesignation());
	}

}
