class  DeliveryBoy
{
	public static void main(String[] args) 
	{
		Address foodShopAddress = new Address("kukatpally","kukatpally","Hyderabad","T.S",500025);
		Address customerAddress = new Address("KPHB","KPHB","Hyderabad","T.S",500025);
        FoodShop fs = new FoodShop("AmezonWeb","swiggy","Chiken Palaav",150,foodShopAddress);
		Customer c = new Customer("Gopinadh","91-9160423363",customerAddress,fs);
		System.out.println(c);
	}
}
