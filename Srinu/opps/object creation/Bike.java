class Bike         
{
	String name;
	int model;
	float price;
	float weight;

	public static void main(String[] args) 
	{
		Bike b=new Bike();
		System.out.println(b.name);
		System.out.println(b.model);
		System.out.println(b.price);
		System.out.println(b.weight);
		System.out.println("=========");
		b.name="hero";
		b.model=2020;
		b.price=70000;
        b.weight=120;
		System.out.println(b.name);
		System.out.println(b.model);
		System.out.println(b.price);
		System.out.println(b.weight);
		System.out.println("=========");
		b.name="bajaj";
		b.model=2021;
		b.price=68000;
        b.weight=100;
		System.out.println(b.name);
		System.out.println(b.model);
		System.out.println(b.price);
		System.out.println(b.weight);

	}
}
