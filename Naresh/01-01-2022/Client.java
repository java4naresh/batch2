class Client 
{
	public static void main(String[] args) 
	{
		Address bankAdress = new Address("kukatpaly", "kukatpally", "Hyderabad", "TS", 500072);
		Address customerAdress = new Address("Jntu", "KPHB", "Hyderabad", "TS", 500072);
        Bank bank = new Bank("HDFC", "HDFC0000512", "Sivaram", bankAdress);
		Customer customer = new Customer("KambalaNaresh", "4512345678", "9951288766", "java4naresh@gmail.com", "4564", 'M', customerAdress, bank);
		System.out.println(customer);

	}
}
