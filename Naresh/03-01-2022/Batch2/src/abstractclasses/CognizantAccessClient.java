package abstractclasses;

public class CognizantAccessClient {

	public static void main(String[] args) {
		CognizantAccess naresh = new CognizantEmployee2();
		CognizantAccess venki = new CognizantEmployee2();
		CognizantAccess gopi = new CognizatEmployee();
		CognizantAccess jhansi = new CognizatEmployee();
		naresh.commonAccess();
		naresh.odc();
		System.out.println("=========");
		venki.commonAccess();
		venki.odc();
		System.out.println("=========");
		gopi.commonAccess();
		gopi.odc();
		System.out.println("=========");
		jhansi.commonAccess();
		jhansi.odc();
	}

}
