package inheritence;

public class Client {

	public static void main(String[] args) {
       Child c = new Child();
       c.m1();
       c.m2();
       c.m3();
       System.out.println(c.land);
       System.out.println(c.home);
       Parent p = new Parent();
       p.m1();
	}

}
