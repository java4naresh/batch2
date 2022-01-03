class  User
{
	public static void main(String[] args) 
	{
		
		Sim sim = new Sim("567438","min","jio","9160423363");
		Battery b = new Battery("DURACELL","li","2500wh","1500");
		Phone  p = new Phone("12345","123478","redmi","s20",sim,b);
		System.out.println(p);
		
	}
}
