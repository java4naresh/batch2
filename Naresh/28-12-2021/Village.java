class Village 
{
	String name;
    String mandal;
	int population;
	String district;
	String state;
	int pincode;
	static String country;

	public Village(String name1,String mandal1,String district1,String state1,int population1,int pincode1) {
	name = name1;
	mandal = mandal1;
	district = district1;
    state = state1;
    population = population1;
    pincode = pincode1;
	}


	public static void main(String[] args) 
	{
        Village.country = "India";
		Village v1 = new Village("VKP", "Bellamkonda", "Guntur", "AP", 1500, 522411);
		System.out.println(v1.name+" "+v1.mandal+" "+v1.population+" "+v1.district+" "+v1.state+" "+v1.pincode+" "+v1.country);
		Village v2 = new Village("KP", "Chintalapalem", "Suryapet", "TS", 1500, 522411);
		System.out.println(v2.name+" "+v2.mandal+" "+v2.population+" "+v2.district+" "+v2.state+" "+v2.pincode+" "+v2.country);
		Village v3 = new Village("Madipadu", "Achampeta", "Guntur", "AP", 1500, 522411);
		System.out.println(v3.name+" "+v3.mandal+" "+v3.population+" "+v3.district+" "+v3.state+" "+v3.pincode+" "+v3.country);
		Village v4 = new Village("Rajupalem", "Rajupalem", "Guntur", "AP", 1500, 522411);
		System.out.println(v4.name+" "+v4.mandal+" "+v4.population+" "+v4.district+" "+v4.state+" "+v4.pincode+" "+v4.country);
		System.out.println("==================================");
		v2.country = "IN";
		v2.name = "KPRM";
		System.out.println(v1.name+" "+v1.mandal+" "+v1.population+" "+v1.district+" "+v1.state+" "+v1.pincode+" "+v1.country);
	    System.out.println(v2.name+" "+v2.mandal+" "+v2.population+" "+v2.district+" "+v2.state+" "+v2.pincode+" "+v2.country);
	    System.out.println(v3.name+" "+v3.mandal+" "+v3.population+" "+v3.district+" "+v3.state+" "+v3.pincode+" "+v3.country);
	    System.out.println(v4.name+" "+v4.mandal+" "+v4.population+" "+v4.district+" "+v4.state+" "+v4.pincode+" "+v4.country);
	}
}
