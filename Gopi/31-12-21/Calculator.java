class  Calculator
{
	public static void main(String[] args) 
	{
		 Calculator c = new  Calculator();
      LO lo = new LO();
		int results = lo.additions(4,5,7,2,5,8);
        System.out.println(results);
		System.out.println(lo.additions(4,5,7,2,5,8,9));

		//LO lo1 = new LO();
		lo.doAddAndPrint(2,4,6,8,3);
		//LO lo2 = new LO();
         int results1 = lo.multifiction(10,20);
		 System.out.println(results1);
		//LO lo= new LO();
		lo.doMulAndPrint();
		
		
	}
}
