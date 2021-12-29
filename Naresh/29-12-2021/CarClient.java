class CarClient 
{
	public static void main(String[] args) 
	{
		Engine engine = new Engine("turbo", "45451", "1000CC", "450", "451");
		Car car = new Car("S21", "Ferrari", 20000000, engine);

		System.out.println(car);
	}
}
