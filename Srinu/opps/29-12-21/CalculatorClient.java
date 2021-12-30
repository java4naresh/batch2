class  CalculatorClient
{
	public static void main(String[] args) 
	{
		Calculator cr=new Calculator();
		System.out.println(cr.sum(10,25));//35
	     cr.sumPrint(10,45,25);//80
		 System.out.println(cr.multiplicatin(10,5,20));//30
		 cr.multiplicatinPrint(5,5,10);//15
		 System.out.println(cr.substraction(10,5,10));//15
		 cr.substractionPrint(25,10,15);//20
		 System.out.println(cr.div(10,5));//2
		 cr.divPrint(25,5);//5
		 System.out.println(cr.rem(10,5));//0
		 cr.remPrint(17,3);//2
          System.out.println(Calculator.sum1(20,15));//35 static
         Calculator.sum2(45,45);//90  static
	}

}
