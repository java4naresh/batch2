class EndUser 
{
	public static void main(String[] args) 
	{
       Sim sim = new Sim("456","mini","jio","9160423363");
	   Phone phone = new Phone("432","345","iphone","s20",sim);
	   System.out.println(phone.dail(9,1,6,0,4,2,3,3,6));
	}

}
