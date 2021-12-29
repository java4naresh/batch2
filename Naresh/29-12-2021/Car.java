class Car 
{
	String model;

	String brand;

	double cost;

	Engine engine;

	public Car(String model, String brand, double cost, Engine engine) {
	this.model = model;
	this.brand = brand;
	this.cost = cost;
	this.engine = engine;
	}

	public String toString() {
	return "Car[model="+model+", brand="+brand+",cost="+cost+", Engine="+engine+"]";
	}
}
