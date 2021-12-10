class TriAngleStarExample2 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<6;i++) {
        for(int k=1;k<6;k++) {
		if(i<=k) {//2<=1
		System.out.print("*");
		} else {
		System.out.print(" ");
		}
		
		}
        System.out.print("\b");
		for(int j=5;j>0;j--) {//****
		if(j>=i) {//5>=2
		System.out.print("*");
		} else {
		System.out.print(" ");
		
		}
		
		}
		System.out.println();
		
		}
	}
}
