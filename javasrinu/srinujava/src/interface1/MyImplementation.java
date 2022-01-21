package interface1;

public  class MyImplementation implements  MyInterFace {

	@Override
	public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	
	public int multiply(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}

	
	public int sub(int num1, int num2 ) {
		
		int sub = num1 - num2;
		return sub;
		}
		
		
	
	public int division(int num1, int num2) {
		int div = num1/num2;
		return div;
	}
	public int rem(int num1,int num2) {
		int rem = num1 % num2; 
		return rem;
	}
	
	public  void  addPrint(int num1, int num2) {
		int sum = num1 + num2;
		 System.out.println(sum);
}
	public void subPrint(int num1,int num2) {
		int sub = num1 - num2;
		System.out.println(sub);
	}
	
	public void multiplyPrint(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println(mul);
	}
	
	
	public void divisionPrint(int num1, int num2) {
		int div = num1/num2;
		System.out.println(div);
	}
	public void remPrint(int num1,int num2) {
		int rem = num1 % num2; 
		System.out.println(rem);
	}
     public  int add1(int... nums) {
    	 if(nums!=null) {
    		 int add1 = 0;
    		 for (int i = 0;i< nums.length;i++) {
    			 add1 = add1 + nums[i];
    			
    		 }
    		 return add1;
    	 }
    	 return 0;
     }
     public int multiply1(int...nums) {
    	 if (nums!= null) {
    		int mul = 1;
    		for (int i = 0;i < nums.length;i++) {
    			mul = mul * nums[i];
    		} 
    		return mul;
    	 }
    	 return 0;
     }

public int  Armstrong(int num1) {
	int n = 1;
	while(n<=num1) {
    int temp= n;
	int armStrong = 0;
	while(temp != 0) {
	int rem = temp % 10;
	temp = temp / 10;//15,1,0
    armStrong = armStrong + (rem*rem*rem);
	
	}
	if(n == armStrong) System.out.println(n + " is ArmStrong");
	else System.out.println(n + " is not ArmStrong");
	
	}
	return n;
}



	
   
     }
     
