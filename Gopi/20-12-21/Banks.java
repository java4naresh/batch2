class Banks 
{

	String name;
	String branch;
	String city;
	String ifsc;
	int pincode;

	public static void main(String[] args) 
	{
		Banks b = new Banks();
		System.out.println(b.name);
		System.out.println(b.branch);
		System.out.println(b.city);
		System.out.println(b.ifsc);
		System.out.println(b.pincode);

		System.out.println("=============");

		b.name = "SBI";
		b.branch = "Atchampeta";
		b.city  = "Guntur";
		b.ifsc = " SBI00067543";
		b.pincode = 522409;

		System.out.println(b.name);
		System.out.println(b.branch);
		System.out.println(b.city);
		System.out.println(b.ifsc);
		System.out.println(b.pincode);

         


	}
}
