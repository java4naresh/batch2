class Customer 
{
	String name;
	String number;
	Address address;
    FoodShop fs;


	public Customer(String name,String number,Address address,FoodShop fs){
		this.name = name;
		this.number = number;
		this.address = address;
		this.fs = fs;
		}


		public String toString(){
			return "Customer[name="+name+",number="+number+",address="+address+",fs="+fs+"]";
		}
}
