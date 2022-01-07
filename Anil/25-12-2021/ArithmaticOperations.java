public class ArithmaticOperations {
	public void sum(int num1 ,int num2){
	     int num3 = num1 +num2;
	   System.out.println(num3);
	}
	      
	  public int sumAndPrint(int num1 ,int num2 ,int num3){
	      int result = num1 +num2+num3;
	  return result;
}
	  public void addition(int num1 ,int num2) {
		  int num3 =num1 -num2;
		  System.out.println(num3);
	  }
	  public long multification(long num1 ,long num2) {
		  long  result =num1*num2;
				  return result;
	  }
	  public void multificationAndPrint(int num1 ,int num2,int num3 ) {
	    int num4 = num1*num2*num3;
	  System.out.println(num4);
}
	  public static void main(String args[]) {
		  ArithmaticOperations ar = new ArithmaticOperations();
		  ar.sum(23, 56);
		  ar.addition(56, 78);
		 System.out.println( ar.sumAndPrint(56, 89,89));
		  System.out.println(ar.multification(56,89));
		  ar.multificationAndPrint(45,56,56);
	  }