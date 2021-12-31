class Calculator 
{
	public static int addition(int... nums){// var args
		if(nums != null) {
        int sum = 0;
		for(int i=0; i<nums.length; i++) {
		sum = sum+nums[i];
		}
		return sum;
		}
		return  0;
	}
}
