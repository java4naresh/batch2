class  LO
{
	
	public int additions(int...nums){
		if(nums!= null){
		int sum = 0;
		for(int i=0;i<nums.length;i++){
			sum = sum+nums[i];
		}
		 return sum;
		}
		return  0;
		
	}
    public void doAddAndPrint(int...nums){
           if(nums!= null){
		int sum = 0;
		for(int i=0;i<nums.length;i++){
			sum = sum+nums[i];
		}
		 System.out.println( sum);
		}

		}
	public int multifiction(int...nums){
		if(nums!= null){
		int mul = 0;
		for(int i=0;i<nums.length;i++){
			mul = mul*nums[i];
		}
		 return mul;
		}
		return  0;
	 }
	 public void doMulAndPrint(int...nums){
		
		 if(nums!= null){
		int mul = 1;
		for(int i=0;i<nums.length;i++){
			mul = mul*nums[i];
		}
		 System.out.println( mul);
		}
		System.out.println(0);
		}
	 
    

}
