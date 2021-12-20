class Village 
{

    String name = "Kukatpally";

	String mandal = "Kukatpally";

	String district = "Hyderabad";

	String state = "Telangana";

	int pincode;

	int population;

	public static void main(String[] args) 
	{
		Village v = new Village();
		System.out.println(v.name);
		System.out.println(v.mandal);
		System.out.println(v.district);
		System.out.println(v.state);
		System.out.println("===============");
		v.name = "VKP";
		v.mandal = "Bellamkonda";
		v.district = "Guntur";
		v.state = "AP";
		System.out.println(v.name);
		System.out.println(v.mandal);
		System.out.println(v.district);
		System.out.println(v.state);
		v.name = "VKPlm";
		v.mandal = "BKD";
		v.district = "GT";
		v.state = "Andhra Pradesh";
        System.out.println("===============");
		System.out.println(v.name);
		System.out.println(v.mandal);
		System.out.println(v.district);
		System.out.println(v.state);
	}
}
