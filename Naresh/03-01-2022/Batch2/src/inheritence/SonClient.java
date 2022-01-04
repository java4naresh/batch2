package inheritence;

public class SonClient {

	public static void main(String[] args) {
       Son s = new Son("Naresh", 30, 5.8f, "Brahmam", 55, 5.5f, "Kambala");
       String name = s.getName();
       System.out.println(name);
	}

}
