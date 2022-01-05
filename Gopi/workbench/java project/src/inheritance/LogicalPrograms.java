package inheritance;

public class LogicalPrograms {
	
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
}
