public class Address 
{
	public String address1;

	public String address2;

	public String mandal;

	public String city;

	public String state;

	public int pincode;

	public static String country = "India";

	public Address(String add1, String add2, String mandal1, String ct,String st, int pc) {
	address1 = add1;
    address2 = add2;
    mandal = mandal1;
    city = ct;
    state = st;
    pincode = pc;
	}

}
