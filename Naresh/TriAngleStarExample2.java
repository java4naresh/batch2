class TriAngleStarExample2 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<11;i++) {
			if( i < 5) {
			for(int x=5; x>0;x--) {//5
				
			   if(i>=x) System.out.print("*");
			   else System.out.print(" ");
				
			}
			System.out.print("\b");
			for(int y=1;y<6;y++) {
				
			if(i>=y) System.out.print("*");
			else System.out.print(" ");
				
			}
			}
			if(i>5) {
        for(int k=6;k<11;k++) {
        if(i>=5) {
		if(i<=k) {//2<=1
		System.out.print("*");
		} else {
		System.out.print(" ");
		}
		}
		}
        System.out.print("\b");
		for(int j=10;j>5;j--) {//****
		if(i>=5) {
			if(j>=i) {//5>=2
		System.out.print("*");
		} else {
		System.out.print(" ");
		
		}
		}
		
		}
			}
		if(i != 5)
		System.out.println();
		
		}
	}
}

