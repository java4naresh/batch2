class Fruit 
{
	String name;
	String taste;
	String color;
	int quanity;
	char isDamaged;

	public static void main(String[] args) 
	{
		Fruit f = new Fruit();
		/*System.out.println(f.hashCode());
		System.out.println(f.name);//null
		System.out.println(f.taste);//null
		System.out.println(f.color);//null
		System.out.println(f.quanity);//0
		System.out.println(f.isDamaged);//empty
		System.out.println("===============");*/
		System.out.println(f);
		f.name = "Mango";
		f.taste = "Sweet";
		f.color = "Yellow";
		/*System.out.println(f.name);//Mango
		System.out.println(f.taste);//Sweet
		System.out.println(f.color);//Yellow*/
		System.out.println(f);
	}

	
}
