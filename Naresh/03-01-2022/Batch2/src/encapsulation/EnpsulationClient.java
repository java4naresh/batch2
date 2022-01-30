package encapsulation;

public class EnpsulationClient {

	public static void main(String[] args) {

		Customer c = new Customer("Naresh", 'M', 30, 9951288766l, "hjhhjh", "DYKPK7402R");
		//Customer c = new Customer();
		c.setName("Naresh");
		c.setGender('M');
		c.setAge(30);
		c.setPhoneNumber(9951288766l);
		c.setAadhar("jhjhjjh");
		c.setPan("DYKPK7402R");
		System.out.println(c.getName());
		System.out.println(c.getGender());
		System.out.println(c.getAge());
		System.out.println(c.getPhoneNumber());
		System.out.println(c.getAadhar());
		System.out.println(c.getPan());
		System.out.println(c);
	}

}
