package Gopi.nadh.package1;

class Pen 
{
	String comName;
	String colour;
	String penType;
	float  weight;
	float height;
	float price;
	public static void main(String[] args) 
	{
		Pen p = new Pen();
		p.comName = "Santoor";
		p.colour = "red";
		p.penType = "black";
		p.weight = 1.2f;
		p.height = 2.1f;
		p.price = 10.0f;


		System.out.println(p.comName);
		System.out.println(p.colour);
		System.out.println(p.penType);
		System.out.println(p.weight);
		System.out.println(p.height);
		System.out.println(p. price);




		System.out.println(p);
	}
}
