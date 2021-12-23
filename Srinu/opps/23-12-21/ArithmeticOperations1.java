class ArithmeticOperations1 
{
	public static void main(String[] args) 
	{
		ArithmeticOperations1 ap=new ArithmeticOperations1();
	
		System.out.println(ap.div(17,2));
		ap.divPrint(25,2);
		System.out.println(ap.divison(25,3));
		ap.divisonPrint(13,3);
	}
	public float div(int num1,int num2){
	 if (num1==0||num2==0) return 0;
	 float a=(float) num1/ (float)num2;
	 return a;
	 	 
	}
	public void divPrint(int num1,int num2){
		
		if (num1!=0||num2!=0) {
		 float a=(float) num1/(float)num2;
	System.out.println(a);
		}
	}
	public double divison(int num1,int num2){
		if (num1==0||num2==0) return 0;
  
		return (double)num1/ (double)num2;
	
	}
	public void divisonPrint(int num1,int num2){

		if(num1!=0||num2!=0){
		System.out.println((double)	num1/(double)num2);

		}
		}
		
}
