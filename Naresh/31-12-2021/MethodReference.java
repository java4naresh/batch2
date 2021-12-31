class MethodReference 
{

	public void doSomething(Village village) {
		Operations op = new Operations();
        op.doOperation(village);
	    village.name = "vkplm";
	}

	public static void main(String[] args) 
	{
		Village village = new Village("Vkp", "Bellamkonda", "Guntur", "AP", 1200, 522411);
        System.out.println(village);//Vkp
		MethodReference mr = new MethodReference();
		mr.doSomething(village);
		System.out.println(village);//vkplm
	}
}
