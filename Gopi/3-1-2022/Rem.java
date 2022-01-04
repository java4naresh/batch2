class  Rem extends Div
{
	public double rem(int num1,int num2){
		if(num1==0 || num2==0) return 0;
		else return (double)(num1%num2);
	 }
	 public  void doRemAndPrint(int num1, int num2){
		if(num1==0 || num2==0){
			System.out.println("0");
		}else {
			int total = num1%num2;
			System.out.println ( total);
		}
	 }
}
