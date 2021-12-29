class Client 
{
	public static void main(String[] args) 
	{
		Sim sim = new Sim("4512", "Mini", "JIO", "9951288766");
		Phone phone = new Phone("451", "452", "IPhone", "7Pro", sim);
		System.out.println(phone);
	}
}
