class Customer 
{
	public static void main(String[] args) 
	{
     Engine en = new Engine("merbo","A12345",500,"12462A",950);
	 Vehile ve = new Vehile("four wheel","swift",2020,"maruthi suziki",en);
	 ServiceCenter sc = new ServiceCenter ("pavan motors","hyd","kp","hyd","sangareddy","telangana",500072,ve);
	 ServiceDetails sd = new ServiceDetails("gendral service",5000.0f,sc);
    System.out.println(sd);
		
	}
}
