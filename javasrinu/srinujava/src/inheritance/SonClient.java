package inheritance;

public class SonClient {

	public static void main(String[] args) {
		Son s = new Son("srinu",25,5.5f,"THR",55,5.8f,"narasaiah",75,5.9f,"thirumalasetti");
		System.out.println(s);
		Father f = new Father("THR",55,5.8f,"narasaiah",75,5.9f,"thirumalasetti");
		System.out.println(f);
		GrandFather gf = new GrandFather("narasaiah",75,5.9f,"thirumalasetti");
       System.out.println(gf);
       System.out.println(s.getSonDesignation());
       System.out.println(s.getFDesignation());
       System.out.println(s.getGFDesignation());
       
	}

}
