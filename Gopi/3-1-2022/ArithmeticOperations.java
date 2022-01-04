class ArithmeticOperations
{
	public static void main(String[] args){
		Rem rem = new Rem();
        
		int results1 = rem.additions(2,4,6);//12
		System.out.println(results1);
		rem.doAddAndPrint(5,8,9);//22
		int results = rem.subtraction(2,4,6,4);//-12
		System.out.println(results);
		rem.doSubAndPrint(6,8,9,6);//-17
		int results2 = rem.multifiction(4,6);//24
		System.out.println(results2);
		rem.doMulAndPrint(8,3);//24
		float results3 = rem.div(4,6);//0.0
		System.out.println(results3);
		rem.doDivAndPrint(6,4);//1.5 
		double results4 = rem.rem(10,2);//0.00
		System.out.println(results4);
		rem.doRemAndPrint(2,10);//2
	}

	
}