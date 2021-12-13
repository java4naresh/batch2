class ArmstrongTest 
{
	public static void main(String[] args) 
	{
		// 153 -> 1*1*1+5*5*5+3*3*3=153 - armstrong number
		//System.out.println("Hello World!");
		//int number = 153;
		//int temp = number;
		//int rem = number % 10;
		//number = number / 10;
		int n = 1;
		while(n<501) {
        int temp= n;
		int armStrong = 0;
		while(temp != 0) {//1
		int rem = temp % 10;//3,5,1
		temp = temp / 10;//15,1,0
        armStrong = armStrong + (rem*rem*rem);//27+125+1
		
		}
		if(n == armStrong) System.out.println(n + " is ArmStrong");
		else System.out.println(n + " is not ArmStrong");
		n++;
		}

	}
}
