package abstractclasses;

public class HousingSchemeClient {

	public static void main(String[] args) {
		HousingScheme s1 = new Sanctioner1();
		s1.bricks();
		s1.cement();
		s1.design();
		s1.iron();
		s1.sand();
		System.out.println("==============");
		HousingScheme s2 = new Sanctioner2();
		s2.bricks();
		s2.cement();
		s2.design();
		s2.iron();
		s2.sand();
	}

}
