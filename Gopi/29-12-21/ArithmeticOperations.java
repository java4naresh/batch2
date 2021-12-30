class  ArithmeticOperations
{
	public static void main(String[] args) 
	{
       ArithmeticOperations  ao = new ArithmeticOperations();
		LogicalOperation lo = new LogicalOperation();
             int results= lo.addetions(5,10,15);//30
             System.out.println(results);
	    LogicalOperation lo1 = new LogicalOperation();
		     lo1.doAddAndPrint(2,6,9);//17
	    LogicalOperation lo2 = new LogicalOperation();
		     int results1= lo2.subtraction(5,10,15,20);//-40
             System.out.println(results1);
		LogicalOperation lo3 = new LogicalOperation();
		     lo3.doSubAndPrint(5,15,20,5);//-35
		LogicalOperation lo4 = new LogicalOperation();
		     int results2= lo4.multifiction(15,20);//300
             System.out.println(results2);
		LogicalOperation lo5 = new LogicalOperation();
		     lo5.doMulAndPrint(5,7);//35
		LogicalOperation lo6 = new LogicalOperation();
		     float results3= lo6.div(15,10);//1.5
             System.out.println(results3);
		LogicalOperation lo7 = new LogicalOperation();
		     lo7.doDivAndPrint(10,5);//2
		LogicalOperation lo8 = new LogicalOperation();
		     double results4= lo8.rem(10,5);//0
             System.out.println(results4);
		LogicalOperation lo9 = new LogicalOperation();
		     lo9.doRemAndPrint(5,6);//1
	}

}
